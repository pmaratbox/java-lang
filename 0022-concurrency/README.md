# 0022 — Concurrency

Start two tasks that produce `1` and `2`, let them run concurrently, then join their results and print `sum: 3`. `CompletableFuture.supplyAsync` runs each supplier on the common `ForkJoinPool` and returns a future; `get()` blocks for the result. It composes asynchronous work (`thenApply`, `thenCombine`) far more flexibly than a raw `Thread`.

## Run

    javac Concurrency.java && java Concurrency
