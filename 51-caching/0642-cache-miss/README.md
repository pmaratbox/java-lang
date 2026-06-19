# 0642 — Cache miss

Uses commons-collections4 `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`). Looking up key `x` in an empty cache returns `null` from `get`, which signals a cache miss, so the program prints `miss`.

## Run

    jbang CacheMiss.java
