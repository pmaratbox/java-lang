# 0535 — Prepend & append

Vavr's persistent `io.vavr.collection.List` adds to both ends with `prepend` and `append`: each call returns a brand-new immutable list while the original `[2, 3]` stays unchanged. Chaining `prepend(1)` then `append(4)` yields a new list printed space-joined via `mkString(" ")`.

## Run

    jbang PrependAppend.java
