# 0108 — Parallel Tasks Combined

Run two independent tasks that produce 10 and 20 concurrently, then combine (sum) their results into `30`. `CompletableFuture.supplyAsync` runs each task on the common pool and `thenCombine` merges the two results.

## Run

    javac TasksCombine.java && java TasksCombine
