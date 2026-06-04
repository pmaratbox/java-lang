# 0104 — Atomic Counter

Increment a shared atomic counter from multiple threads 1000 times total without a lock, printing `1000`. `AtomicInteger.incrementAndGet()` performs a lock-free compare-and-swap that is safe across threads.

## Run

    javac Counter.java && java Counter
