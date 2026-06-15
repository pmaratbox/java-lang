# 0447 — Batch insert

Insert many rows efficiently in one transaction. This lesson opens an in-memory SQLite database via JDBC's `DriverManager`, creates a `t(n integer)` table, then inserts the values 1..1000 using a `PreparedStatement` with `addBatch`/`executeBatch` inside a single transaction (autocommit off, then `commit`). It finally runs `select count(*) from t` and prints the count. Uses the real `org.xerial:sqlite-jdbc` driver.

## Run

    jbang BatchInsert.java
