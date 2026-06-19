# 0648 — Capacity bound

Uses Apache Commons Collections `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`) with capacity 3. After putting four keys `a`, `b`, `c`, `d`, the map evicts the least-recently-used entry to honor its fixed bound, so `size()` never exceeds the capacity and prints `3`.

## Run

    jbang CacheCapacity.java
