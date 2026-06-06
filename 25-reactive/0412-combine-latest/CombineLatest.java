import java.util.PriorityQueue;
import java.util.Comparator;

public class CombineLatest {
    // A virtual-time scheduler: a priority queue of (time, seq, callback).
    static final class Scheduler {
        record Task(long time, long seq, Runnable cb) {}

        private final PriorityQueue<Task> queue = new PriorityQueue<>(
            Comparator.<Task>comparingLong(Task::time).thenComparingLong(Task::seq));
        private long seq = 0;
        long clock = 0;

        void schedule(long time, Runnable cb) {
            queue.add(new Task(time, seq++, cb));
        }

        void run() {
            while (!queue.isEmpty()) {
                Task t = queue.poll();
                clock = t.time();
                t.cb().run();
            }
        }
    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        // Latest values, initially absent.
        Integer[] latestA = {null};
        Integer[] latestB = {null};

        Runnable emit = () -> {
            if (latestA[0] != null && latestB[0] != null) {
                System.out.println("(" + latestA[0] + ", " + latestB[0] + ")");
            }
        };

        // A schedules (1->1),(3->2).
        scheduler.schedule(1, () -> { latestA[0] = 1; emit.run(); });
        scheduler.schedule(3, () -> { latestA[0] = 2; emit.run(); });

        // B schedules (2->10).
        scheduler.schedule(2, () -> { latestB[0] = 10; emit.run(); });

        scheduler.run();
    }
}
