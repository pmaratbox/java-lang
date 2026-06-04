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

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[8];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(OnceInit::init);
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("init count: " + initCount.get());
    }
}
