# 0683 — Reduce

This lesson uses the [Vavr](https://www.vavr.io/) functional collection library's `foldLeft` to reduce the immutable `List` `[1,2,3,4,5]` to a single value by addition, starting from an initial accumulator of `0`. `foldLeft` walks left-to-right, combining the running accumulator with each element via `Integer::sum`, producing `15`.

## Run

    jbang FpReduce.java
