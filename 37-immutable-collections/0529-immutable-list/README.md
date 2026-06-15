# 0529 — Immutable list

Uses the [Vavr](https://www.vavr.io/) persistent collection library:
`io.vavr.collection.List` is immutable, so `append(4)` does not mutate the
original list — it RETURNS A NEW `List` that shares structure with the old one.
Printing the new list (`1 2 3 4`) and then the original (`1 2 3`) shows the
original is unchanged.

## Run

    jbang ImmutableList.java
