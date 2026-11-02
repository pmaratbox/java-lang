import java.util.concurrent.atomic.AtomicInteger;

void main() throws InterruptedException {
    var r1 = new AtomicInteger();
    var r2 = new AtomicInteger();
    var t1 = new Thread(() -> r1.set(3 * 3));
    var t2 = new Thread(() -> r2.set(4 * 4));
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(r1.get() + r2.get());
}
