# 0451 — Order by

Sort query results by a column using the jOOQ query-builder (`org.jooq:jooq`) over an in-memory SQLite database. This lesson opens a connection with `DriverManager`, builds a `DSLContext` with `SQLDialect.SQLITE`, inserts three users via the `insertInto(...).values(...)` DSL, then selects them with `db.select().from("users").orderBy(field("age").asc())` and prints each name. Ordering comes from the builder's `orderBy` clause, so the rows print youngest-to-oldest.

## Run

    jbang OrderBy.java
