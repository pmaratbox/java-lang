# 0647 — Contains key

Uses Apache Commons Collections `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`) with capacity 3. After `put("a", 1)`, `containsKey` reports membership without promoting recency: `containsKey("a")` is `true` and `containsKey("x")` is `false`. The two booleans print lowercase, space-joined, as `true false`.

## Run

    jbang CacheContains.java
