import java.util.PriorityQueue;
import java.util.function.Consumer;

public class DebounceVirtualTime {
    // A scheduled task on the virtual-time scheduler.
    static final class Task {
        final long time;
        final long seq;
        final Runnable action;
        boolean cancelled;

        Task(long time, long seq, Runnable action) {
            this.time = time;
            this.seq = seq;
            this.action = action;
        }
    }

    // Virtual-time scheduler: a priority queue ordered by (time, seq).
    static final class Scheduler {
        private final PriorityQueue<Task> queue = new PriorityQueue<>((a, b) -> {
            if (a.time != b.time) return Long.compare(a.time, b.time);
            return Long.compare(a.seq, b.seq);
        });
        private long seq = 0;
        long now = 0;

        Task schedule(long time, Runnable action) {
            Task t = new Task(time, seq++, action);
            queue.add(t);
            return t;
        }

        void cancel(Task token) {
            if (token != null) token.cancelled = true;
        }

        void run() {
            while (!queue.isEmpty()) {
                Task t = queue.poll();
                if (t.cancelled) continue;
                now = t.time;
                t.action.run();
            }
        }
    }

    // debounce(window): emit a value only after a quiet gap of `window` ticks.
    static void debounce(Scheduler s, long window, Consumer<String> out,
                         long[] times, String[] values) {
        final Task[] pending = { null };
        // Schedule the source events at their virtual times.
        for (int i = 0; i < times.length; i++) {
            final String value = values[i];
            s.schedule(times[i], () -> {
                s.cancel(pending[0]);
                pending[0] = s.schedule(s.now + window, () -> out.accept(value));
            });
        }
    }

    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        long[] times = { 10, 20, 100 };
        String[] values = { "a", "b", "c" };
        debounce(s, 30, System.out::println, times, values);
        s.run();
    }
}
