public class SpawnJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread[] workers = new Thread[3];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(() -> {
                int x = 1 + 1; // trivial work
            });
            workers[i].start();
        }
        int joined = 0;
        for (Thread w : workers) {
            w.join();
            joined++;
        }
        System.out.println("done: " + joined);
    }
}
