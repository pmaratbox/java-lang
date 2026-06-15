# 0453 — Update a row

Build an in-memory SQLite `users` table, insert three rows, then modify a persisted entity by changing bob's age to 40 through the jOOQ query builder's `update().set().where()` DSL. Finally re-read the rows with `age >= 35` ordered by id, printing `name age`. Uses the real `org.jooq:jooq` query builder over the `org.xerial:sqlite-jdbc` driver (`DSL.using`, `insertInto`, `update`, `select`).

## Run

    jbang UpdateRow.java
