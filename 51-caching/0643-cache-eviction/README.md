# 0643 — LRU eviction

Apache Commons Collections' `LRUMap` is a strict, fixed-capacity LRU cache. With capacity 3 and no lookups between the puts, insertion order is the recency order, so adding `d` evicts the least-recently-used key `a`. Looking up `a` is then a miss while `d` returns its value: `miss 4`.

## Run

    jbang CacheEviction.java
