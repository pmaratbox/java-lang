import java.util.concurrent.atomic.AtomicInteger;

public class ReturnValues {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger r1 = new AtomicInteger();
        AtomicInteger r2 = new AtomicInteger();
        Thread t1 = new Thread(() -> r1.set(3 * 3));
        Thread t2 = new Thread(() -> r2.set(4 * 4));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r1.get() + r2.get());
    }
}
