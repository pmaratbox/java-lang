# 0047 — Immutable Update (Copy-with)

Make a copy of the point `(1, 2)` with its `x` changed to `9`, leaving the original intact, and print `original: (1, 2)` then `updated: (9, 2)`. Java records are immutable but have no copy-with syntax, so a `withX` method reconstructs the record with the new value. Each such "wither" must be written explicitly.

## Run

    javac ImmutableUpdate.java && java ImmutableUpdate
