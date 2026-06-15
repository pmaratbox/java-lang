# 0532 — Update an element

Uses the Vavr persistent collections library. A `io.vavr.collection.List` is
immutable, so calling `.update(index, value)` does not mutate it — it returns a
brand-new list with the element replaced while the original list stays
unchanged. Here index `0` of `[1, 2, 3]` becomes `99`, yielding a new
`99 2 3` while the original still prints `1 2 3`.

## Run

    jbang UpdateElement.java
