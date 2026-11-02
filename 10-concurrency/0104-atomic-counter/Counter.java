import java.util.concurrent.atomic.AtomicInteger;

private static final AtomicInteger counter = new AtomicInteger(0);

void main() throws InterruptedException {
    var threads = new Thread[10];
    for (var i = 0; i < threads.length; i++) {
        threads[i] = new Thread(() -> {
            for (var j = 0; j < 100; j++) {
                counter.incrementAndGet();
            }
        });
        threads[i].start();
    }
    for (var t : threads) {
        t.join();
    }
    System.out.println(counter.get());
}
