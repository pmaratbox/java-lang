import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

private static final int DONE = -1;

void main() throws InterruptedException {
    BlockingQueue<Integer> channel = new LinkedBlockingQueue<>();
    var producer = new Thread(() -> {
        try {
            for (var i = 1; i <= 3; i++) {
                channel.put(i);
            }
            channel.put(DONE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    });
    producer.start();

    var sb = new StringBuilder();
    int value;
    while ((value = channel.take()) != DONE) {
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(value);
    }
    producer.join();
    System.out.println(sb);
}
