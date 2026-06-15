# 0457 — Group by

Aggregate per group via the query API. This lesson uses the **jOOQ** query builder (`org.jooq:jooq`) over an in-memory SQLite database (`org.xerial:sqlite-jdbc`). It inserts three `products` rows with `db.insertInto(...).values(...)`, then builds an aggregate query with jOOQ's DSL — `db.select(field("category"), sum(...)).from(...).groupBy(...).orderBy(...)` — so the `GROUP BY`/`SUM` are expressed through the builder rather than a raw SQL string. Each result row prints as `category sum`.

## Run

    jbang GroupBy.java
