import java.util.PriorityQueue;
import java.util.function.Consumer;

public class ThrottleVirtualTime {

    // Virtual-time scheduler: priority queue of (time, seq, callback).
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

        void cancel(Task t) {
            if (t != null) t.dead = true;
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

    // throttle(window), leading edge: emit, then suppress for `window` ticks.
    static Consumer<String> throttle(Scheduler sched, long window, Consumer<String> downstream) {
        long[] blockUntil = {0};
        return value -> {
            if (sched.now >= blockUntil[0]) {
                blockUntil[0] = sched.now + window;
                downstream.accept(value);
            }
        };
    }

    public static void main(String[] args) {
        Scheduler sched = new Scheduler();
        Consumer<String> throttled = throttle(sched, 30, System.out::println);

        sched.schedule(10, () -> throttled.accept("a"));
        sched.schedule(20, () -> throttled.accept("b"));
        sched.schedule(100, () -> throttled.accept("c"));
        sched.schedule(110, () -> throttled.accept("d"));

        sched.run();
    }
}
