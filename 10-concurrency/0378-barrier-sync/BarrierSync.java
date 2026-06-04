import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class BarrierSync {
    public static void main(String[] args) throws InterruptedException {
        final int n = 3;
        AtomicInteger reached = new AtomicInteger(0);
        CyclicBarrier barrier = new CyclicBarrier(n);
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Thread(() -> {
                try {
                    reached.incrementAndGet();
                    barrier.await();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("all reached: " + reached.get());
    }
}
