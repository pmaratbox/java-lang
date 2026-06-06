import java.util.PriorityQueue;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class SwitchMap {
    // Virtual-time scheduler: priority queue of (time, seq, callback).
    static final class Task {
        final long time;
        final long seq;
        final Runnable cb;
        boolean dead = false;
        Task(long time, long seq, Runnable cb) { this.time = time; this.seq = seq; this.cb = cb; }
    }

    static final class Scheduler {
        private final PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> {
            if (a.time != b.time) return Long.compare(a.time, b.time);
            return Long.compare(a.seq, b.seq);
        });
        private long seq = 0;
        long now = 0;

        Task schedule(long delay, Runnable cb) {
            Task t = new Task(now + delay, seq++, cb);
            pq.add(t);
            return t;
        }

        void cancel(Task t) { if (t != null) t.dead = true; }

        void run() {
            while (!pq.isEmpty()) {
                Task t = pq.poll();
                if (t.dead) continue;
                now = t.time;
                t.cb.run();
            }
        }
    }

    public static void main(String[] args) {
        Scheduler sched = new Scheduler();
        IntConsumer sink = n -> System.out.println(n);

        // inner(n): schedules (now+5 -> n), (now+30 -> n*10).
        // Returns a canceller for its still-pending emissions.
        IntFunction<Runnable> inner = n -> {
            Task a = sched.schedule(5, () -> sink.accept(n));
            Task b = sched.schedule(30, () -> sink.accept(n * 10));
            return () -> { sched.cancel(a); sched.cancel(b); };
        };

        // switchMap: cancel previous inner before starting the new one.
        final Runnable[] currentCancel = { null };

        Runnable[] startInner = new Runnable[2];
        startInner[0] = () -> {
            if (currentCancel[0] != null) currentCancel[0].run();
            currentCancel[0] = inner.apply(1);
        };
        startInner[1] = () -> {
            if (currentCancel[0] != null) currentCancel[0].run();
            currentCancel[0] = inner.apply(2);
        };

        // outer: (10 -> 1), (20 -> 2).
        sched.schedule(10, startInner[0]);
        sched.schedule(20, startInner[1]);

        sched.run();
    }
}
