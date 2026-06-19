# 0688 — Group by

Uses the [Vavr](https://www.vavr.io/) functional collection library's `groupBy` transform to group `[1..6]` by parity. `groupBy` returns a `Map<String, List<Integer>>`; we convert it with `toSortedMap` (natural key order, so `even` precedes `odd`) and render each entry as `key:v1,v2,...`, joining entries with `;`.

## Run

    jbang FpGroupBy.java
