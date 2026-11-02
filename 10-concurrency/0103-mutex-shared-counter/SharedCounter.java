private static int counter = 0;
private static final Object lock = new Object();

void main() throws InterruptedException {
    var threads = new Thread[10];
    for (var i = 0; i < threads.length; i++) {
        threads[i] = new Thread(() -> {
            for (var j = 0; j < 100; j++) {
                synchronized (lock) {
                    counter++;
                }
            }
        });
        threads[i].start();
    }
    for (var t : threads) {
        t.join();
    }
    System.out.println(counter);
}
