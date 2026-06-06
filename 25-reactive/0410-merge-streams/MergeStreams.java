import java.util.PriorityQueue;
import java.util.function.Consumer;

public class MergeStreams {

    // Virtual-time scheduler: a priority queue of (time, seq, callback).
    static final class Scheduler {
        static final class Task {
            final long time;
            final long seq;
            final Runnable cb;
            boolean dead;

            Task(long time, long seq, Runnable cb) {
                this.time = time;
                this.seq = seq;
                this.cb = cb;
            }
        }

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

        void cancel(Task token) {
            if (token != null) token.dead = true;
        }

        void run() {
            while (!queue.isEmpty()) {
                Task t = queue.poll();
                if (t.dead) continue;
                now = t.time;
                t.cb.run();
            }
        }
    }

    // A minimal observer.
    static final class Observer<T> {
        final Consumer<T> next;
        Observer(Consumer<T> next) { this.next = next; }
        void onNext(T value) { next.accept(value); }
    }

    // A push-based Observable built from scratch: a producer wired to an observer.
    static final class Observable<T> {
        final Consumer<Observer<T>> producer;
        Observable(Consumer<Observer<T>> producer) { this.producer = producer; }
        void subscribe(Observer<T> observer) { producer.accept(observer); }
    }

    // A timed source: emits each (time, value) by scheduling it on the scheduler.
    static Observable<Integer> timed(Scheduler scheduler, long[] times, int[] values) {
        return new Observable<>(observer -> {
            for (int i = 0; i < times.length; i++) {
                final int value = values[i];
                scheduler.schedule(times[i], () -> observer.onNext(value));
            }
        });
    }

    // merge: subscribe to both sources onto the same observer.
    static Observable<Integer> merge(Observable<Integer> a, Observable<Integer> b) {
        return new Observable<>(observer -> {
            a.subscribe(observer);
            b.subscribe(observer);
        });
    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        Observable<Integer> streamA = timed(scheduler,
                new long[]{10, 30, 50}, new int[]{1, 3, 5});
        Observable<Integer> streamB = timed(scheduler,
                new long[]{20, 40, 60}, new int[]{2, 4, 6});

        merge(streamA, streamB).subscribe(new Observer<>(System.out::println));

        scheduler.run();
    }
}
