# 0454 — Delete a row

Build an in-memory SQLite `users` table, insert three rows, then remove a persisted entity (the user with `id = 1`) through the jOOQ query builder's `deleteFrom().where()` DSL. Finally re-read the remaining rows ordered by id and print each name (`bob`, `carol`). Uses the real `org.jooq:jooq` query builder over the `org.xerial:sqlite-jdbc` driver (`DSL.using`, `insertInto`, `deleteFrom`, `select`).

## Run

    jbang DeleteRow.java
