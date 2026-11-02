import java.util.concurrent.atomic.AtomicInteger;

public class OnceInit {
    private static final AtomicInteger initCount = new AtomicInteger(0);
    private static volatile boolean initialized = false;
    private static final Object lock = new Object();

    private static void init() {
        if (!initialized) {
            synchronized (lock) {
                if (!initialized) {
                    initCount.incrementAndGet();
                    initialized = true;
                }
            }
        }
    }

    void main() throws InterruptedException {
        var threads = new Thread[8];
        for (var i = 0; i < threads.length; i++) {
            threads[i] = new Thread(OnceInit::init);
            threads[i].start();
        }
        for (var t : threads) {
            t.join();
        }
        IO.println("init count: " + initCount.get());
    }
}
