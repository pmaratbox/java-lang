# 0689 — Take

Uses the [Vavr](https://www.vavr.io/) functional collection library's `take` transform to keep the first 3 elements of `[1..10]`. `take(n)` returns a new immutable `List` with at most `n` leading elements; we render it with `mkString(",")` to get `1,2,3`.

## Run

    jbang FpTake.java
