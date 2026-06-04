import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessagePassing {
    private static final int DONE = -1;

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> channel = new LinkedBlockingQueue<>();
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    channel.put(i);
                }
                channel.put(DONE);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();

        StringBuilder sb = new StringBuilder();
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
}
