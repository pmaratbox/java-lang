# 0456 — Sum aggregate

Sum a column with the real **jOOQ** query-builder library over an in-memory SQLite database. A `DSLContext` is created with `DSL.using(connection, SQLDialect.SQLITE)`; the `users(id, name, age)` table is created with raw DDL (jOOQ has no model-driven schema generator on the runtime path), then all data operations go through the jOOQ DSL — `db.insertInto(table("users"), ...).values(...).execute()` to insert and `db.select(sum(field("age", Integer.class))).from("users").fetchOne(0, int.class)` to compute the total age via the `sum()` aggregate function. The total (`90`) is printed. Uses `org.jooq:jooq` with the `org.xerial:sqlite-jdbc` driver. (Note: `org.jooq.Record` is fully qualified elsewhere to avoid clashing with `java.lang.Record`.)

## Run

    jbang SumAggregate.java
