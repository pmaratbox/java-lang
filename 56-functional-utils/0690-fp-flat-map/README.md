# 0690 — Flat map

This lesson uses the [vavr](https://www.vavr.io/) functional collection library and its `flatMap` transform. `flatMap` maps each element to a sub-list and then flattens the results into a single list: applying `x -> List.of(x, x*10)` over `[1, 2, 3]` yields `[1, 10, 2, 20, 3, 30]`, which is comma-joined with `mkString`.

## Run

    jbang FpFlatMap.java
