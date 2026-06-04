# 0378 — Barrier Synchronization

Have 3 threads each arrive at a barrier before any proceeds, then print `all reached: 3`. Java's `CyclicBarrier` releases all parties once the configured count have called `await`.

## Run

    javac BarrierSync.java && java BarrierSync
