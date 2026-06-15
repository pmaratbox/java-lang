# 0531 — Immutable set

Vavr's `io.vavr.collection.HashSet` is a persistent (immutable) set. Calling `.add(4)` does not mutate the receiver; it RETURNS A NEW set that shares structure with the original, while the original set stays unchanged. Here we build `{1, 2, 3}`, add `4` to get a new four-element set, and print the new set's size (`4`) followed by the original's size (`3`).

## Run

    jbang ImmutableSet.java
