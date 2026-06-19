# 0646 — Update a value

Uses Apache Commons Collections `LRUMap` (the strict, access-order LRU cache from `org.apache.commons:commons-collections4`) with capacity 3. Calling `put("a", 1)` then `put("a", 2)` re-uses the same key, replacing the stored value rather than adding a second entry. A `get("a")` then returns the updated value, which prints `2`.

## Run

    jbang CacheUpdate.java
