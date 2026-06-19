# 0641 — Put and get

Uses Apache Commons Collections `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`) with capacity 3. After `put("a", 1)`, a `get("a")` returns the stored value, which prints `1`. A `get` on this map promotes the key to most-recently-used; a missing key returns `null` and prints `miss`.

## Run

    jbang CachePutGet.java
