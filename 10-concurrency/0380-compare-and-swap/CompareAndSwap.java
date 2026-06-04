import java.util.concurrent.atomic.AtomicInteger;

public class CompareAndSwap {
    public static void main(String[] args) throws InterruptedException {
        final AtomicInteger value = new AtomicInteger(0);
        final int threads = 4;
        final int perThread = 25;
        Thread[] ts = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            ts[i] = new Thread(() -> {
                for (int j = 0; j < perThread; j++) {
                    int cur, next;
                    do {
                        cur = value.get();
                        next = cur + 1;
                    } while (!value.compareAndSet(cur, next));
                }
            });
            ts[i].start();
        }
        for (Thread t : ts) t.join();
        System.out.println(value.get());
    }
}
