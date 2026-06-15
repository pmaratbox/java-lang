# 0448 — Upsert

Insert or update a row on primary-key conflict. This lesson creates an `inv(item, qty)` table, inserts `apple` with quantity 5, then runs upserts using `insert ... on conflict(item) do update set qty=qty+excluded.qty` so re-inserting `apple` accumulates its quantity to 10 while `banana` is inserted fresh. It finally selects the rows ordered by item and prints each as `item qty`. Uses the real `org.xerial:sqlite-jdbc` driver via JDBC.

## Run

    jbang Upsert.java
