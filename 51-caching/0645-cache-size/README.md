# 0645 — Cache size

Uses Apache Commons Collections `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`) with capacity 5. After `put("a", 1)` and `put("b", 2)`, the map holds two entries, so `size()` reports the number of stored keys, which prints `2`. Because the capacity (5) exceeds the entry count, no eviction has occurred.

## Run

    jbang CacheSize.java
