import java.util.concurrent.atomic.AtomicInteger;

void main() throws InterruptedException {
    final var value = new AtomicInteger(0);
    final var threads = 4;
    final var perThread = 25;
    var ts = new Thread[threads];
    for (var i = 0; i < threads; i++) {
        ts[i] = new Thread(() -> {
            for (var j = 0; j < perThread; j++) {
                int cur, next;
                do {
                    cur = value.get();
                    next = cur + 1;
                } while (!value.compareAndSet(cur, next));
            }
        });
        ts[i].start();
    }
    for (var t : ts) t.join();
    System.out.println(value.get());
}
