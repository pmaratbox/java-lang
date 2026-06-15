# 0452 — Limit

Uses the **jOOQ** query-builder (`org.jooq:jooq`) over an in-memory SQLite database via `org.xerial:sqlite-jdbc`. After inserting three users with `db.insertInto(...).values(...).execute()`, it builds `db.select(field("name")).from(table("users")).orderBy(field("age").desc()).limit(2).fetch()` to take only the top two rows by descending age, then prints each name. The `DSLContext` is created with `DSL.using(connection, SQLDialect.SQLITE)`.

## Run

    jbang Limit.java
