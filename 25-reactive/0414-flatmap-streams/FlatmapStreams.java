import java.util.PriorityQueue;

// Virtual-time scheduler: deterministic, push-based reactive primitives from scratch.
public class FlatmapStreams {

    // A scheduled task: fires at virtual time `time`, ordered by insertion `seq`.
    static final class Task {
        final long time;
        final long seq;
        final Runnable cb;
        boolean cancelled = false;

        Task(long time, long seq, Runnable cb) {
            this.time = time;
            this.seq = seq;
            this.cb = cb;
        }
    }

    static final class Scheduler {
        private final PriorityQueue<Task> queue = new PriorityQueue<>((a, b) -> {
            if (a.time != b.time) return Long.compare(a.time, b.time);
            return Long.compare(a.seq, b.seq);
        });
        private long seq = 0;
        long now = 0;

        Task schedule(long time, Runnable cb) {
            Task t = new Task(time, seq++, cb);
            queue.add(t);
            return t;
        }

        void cancel(Task t) {
            if (t != null) t.cancelled = true;
        }

        void run() {
            while (!queue.isEmpty()) {
                Task t = queue.poll();
                if (t.cancelled) continue;
                now = t.time;
                t.cb.run();
            }
        }
    }

    // An observer is a closure with next/complete.
    interface Observer<T> {
        void next(T value);
        void complete();
    }

    // An Observable wires a producer to an observer on subscribe.
    interface Observable<T> {
        void subscribe(Observer<T> observer);
    }

    interface Mapper<T, R> {
        Observable<R> apply(T value);
    }

    // A timed source: emits each (time, value) by scheduling on the shared clock.
    static <T> Observable<T> timed(Scheduler sched, long[] times, T[] values) {
        return observer -> {
            for (int i = 0; i < times.length; i++) {
                final T v = values[i];
                sched.schedule(times[i], () -> observer.next(v));
            }
        };
    }

    // flatMap/mergeMap: map each outer value to an inner stream, merge all inners
    // concurrently (no cancellation of previous inners).
    static <T, R> Observable<R> flatMap(Observable<T> outer, Mapper<T, R> project) {
        return observer -> outer.subscribe(new Observer<T>() {
            @Override
            public void next(T value) {
                // Subscribe to the inner; its events are scheduled relative to now.
                project.apply(value).subscribe(new Observer<R>() {
                    @Override
                    public void next(R r) {
                        observer.next(r);
                    }

                    @Override
                    public void complete() {
                    }
                });
            }

            @Override
            public void complete() {
            }
        });
    }

    public static void main(String[] args) {
        Scheduler sched = new Scheduler();

        // Outer schedules (10->1),(20->2).
        Observable<Integer> outer =
                timed(sched, new long[]{10, 20}, new Integer[]{1, 2});

        // For each outer value n, inner schedules (now+5 -> n) and (now+30 -> n*10).
        Observable<Integer> merged = flatMap(outer, n -> observer -> {
            long now = sched.now;
            sched.schedule(now + 5, () -> observer.next(n));
            sched.schedule(now + 30, () -> observer.next(n * 10));
        });

        merged.subscribe(new Observer<Integer>() {
            @Override
            public void next(Integer value) {
                System.out.println(value);
            }

            @Override
            public void complete() {
            }
        });

        // Drive everything once.
        sched.run();
    }
}
