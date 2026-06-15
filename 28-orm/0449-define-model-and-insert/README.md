# 0449 — Define model & insert

Define the `users` model (`id`, `name`, `age`), insert rows, and read them back using the real **jOOQ** query-builder library over an in-memory SQLite database. A `DSLContext` is created with `DSL.using(connection, SQLDialect.SQLITE)`; the table is created with raw DDL (jOOQ has no model-driven schema generator on the runtime path), then all data operations go through the jOOQ DSL — `db.insertInto(table("users"), ...).values(...).execute()` to insert and `db.select().from("users").orderBy(field("id")).fetch()` to query. Each user's name is printed on its own line. Uses `org.jooq:jooq` with the `org.xerial:sqlite-jdbc` driver. (Note: `org.jooq.Record` is fully qualified to avoid clashing with `java.lang.Record`.)

## Run

    jbang DefineModelAndInsert.java
