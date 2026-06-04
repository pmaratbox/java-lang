# 0380 — Compare-And-Swap Loop

Increment a shared value to 100 using a CAS retry loop from multiple threads, printing `100`. Java's `AtomicInteger.compareAndSet` retries until the swap from the read value succeeds.

## Run

    javac CompareAndSwap.java && java CompareAndSwap
