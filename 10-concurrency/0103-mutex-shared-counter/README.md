# 0103 — Mutex-Protected Counter

Have multiple threads each increment a shared counter under a mutex so the total is exactly `1000`. Java's `synchronized` block acquires a monitor on an object, serializing the increments.

## Run

    javac SharedCounter.java && java SharedCounter
