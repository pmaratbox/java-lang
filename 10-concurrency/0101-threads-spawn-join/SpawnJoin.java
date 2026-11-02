void main() throws InterruptedException {
    var workers = new Thread[3];
    for (var i = 0; i < workers.length; i++) {
        workers[i] = new Thread(() -> {
            var x = 1 + 1; // trivial work
        });
        workers[i].start();
    }
    var joined = 0;
    for (var w : workers) {
        w.join();
        joined++;
    }
    System.out.println("done: " + joined);
}
