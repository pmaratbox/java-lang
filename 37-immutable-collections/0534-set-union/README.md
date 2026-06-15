# 0534 — Set union

Compute the union of two immutable sets `{1,2,3}` and `{3,4,5}` using Vavr's persistent `io.vavr.collection.HashSet`. `.union(other)` RETURNS A NEW set containing all distinct elements; both original sets stay unchanged. The result is converted with `.toSortedSet()` and space-joined for deterministic output, printing `1 2 3 4 5`.

## Run

    jbang SetUnion.java
