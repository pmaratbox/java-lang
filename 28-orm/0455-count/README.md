# 0455 — Count

Count all rows with an aggregate query. This lesson seeds three `users` into an in-memory SQLite database, then uses jOOQ's `DSLContext.selectCount()` query-builder API to issue a `count(*)` aggregate, reading the scalar result with `fetchOne(0, int.class)`. Uses the real `org.jooq:jooq` query builder over the `org.xerial:sqlite-jdbc` driver.

## Run

    jbang Count.java
