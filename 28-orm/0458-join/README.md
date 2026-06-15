# 0458 — Join

Join two tables with the jOOQ query builder (`org.jooq:jooq`) over an in-memory SQLite database. This lesson defines `users` (id, name) and `posts` (id, user_id, title), inserts the rows through jOOQ's `insertInto(...).values(...)` DSL, then runs a `select().from(posts).join(users).on(...)` query ordered by `name, title` and prints each joined row as `name title`. The driver is `org.xerial:sqlite-jdbc` and jOOQ wraps the connection via `DSL.using(conn, SQLDialect.SQLITE)`.

## Run

    jbang Join.java
