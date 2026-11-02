import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

void main() throws InterruptedException {
    final var n = 3;
    var reached = new AtomicInteger(0);
    var barrier = new CyclicBarrier(n);
    var threads = new Thread[n];
    for (var i = 0; i < n; i++) {
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
    for (var t : threads) t.join();
    System.out.println("all reached: " + reached.get());
}
