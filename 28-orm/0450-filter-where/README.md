# 0450 — Filter with where

Query rows matching a condition using the real `org.jooq:jooq` query-builder over an in-memory SQLite database. This lesson creates a `users(id, name, age)` table, inserts three rows with jOOQ's `insertInto(...).values(...)` builder, then runs `db.select().from("users").where(field("age").ge(30)).orderBy(field("id"))` to fetch only users aged 30 or older, in id order, and prints each name. The `where` / `ge` DSL builds the SQL condition — no raw query string. Uses the `org.xerial:sqlite-jdbc` driver for the in-memory database.

## Run

    jbang FilterWhere.java
