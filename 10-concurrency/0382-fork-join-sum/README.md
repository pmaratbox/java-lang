# 0382 — Fork-Join Sum

Recursively fork the sum of [1..8] into halves and join the partial sums, printing `36`. Java's `RecursiveTask` in a `ForkJoinPool` forks one half and joins it while computing the other.

## Run

    javac ForkJoinSum.java && java ForkJoinSum
