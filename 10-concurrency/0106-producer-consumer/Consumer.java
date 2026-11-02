import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

private static final int DONE = -1;

void main() throws InterruptedException {
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
    var producer = new Thread(() -> {
        try {
            for (var i = 1; i <= 5; i++) {
                queue.put(i);
            }
            queue.put(DONE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    });
    producer.start();

    var sum = 0;
    int value;
    while ((value = queue.take()) != DONE) {
        sum += value;
    }
    producer.join();
    IO.println(sum);
}
