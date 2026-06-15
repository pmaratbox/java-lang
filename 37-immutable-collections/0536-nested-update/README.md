# 0536 — Nested update

Uses the Vavr persistent collection library: a `HashMap` holds a nested
`HashMap` (`{user: {age: 30}}`). Calling `.put` on the inner map returns a new
inner map, and `.put` on the outer map returns a new outer map — so the update
produces an entirely new structure while the original stays unchanged.

## Run

    jbang NestedUpdate.java
