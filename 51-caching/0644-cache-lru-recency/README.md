# 0644 — Recency promotion

Uses Apache Commons Collections `LRUMap` (`org.apache.commons.collections4.map.LRUMap`), a strict access-order LRU cache, with capacity 3. After putting `a`, `b`, `c`, a `get("a")` promotes `a` to most-recently-used. Putting `d` then evicts the least-recently-used key `b` (not `a`), so `get("a")` returns `1` while `get("b")` is a `miss`.

## Run

    jbang CacheLruRecency.java
