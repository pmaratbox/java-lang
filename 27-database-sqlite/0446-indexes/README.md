# 0446 — Indexes

Create a database index and use it in a lookup. This lesson builds an in-memory SQLite table of products, inserts three rows, executes `create index idx_sku on products(sku)`, then runs `select price from products where sku=?` with `'B'` bound through a JDBC `PreparedStatement`, printing the matching price (`200`). Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC, with the `CREATE INDEX` statement actually executed before the indexed lookup.

## Run

    jbang Indexes.java
