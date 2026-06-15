# 0445 — Transactions

Create an in-memory SQLite table and exercise real transaction control: in a first transaction insert two rows and `COMMIT` them, then in a second transaction insert another row and `ROLLBACK`, so only the committed rows survive. Finally read the rows back with `SELECT ... ORDER BY n`. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `Connection.setAutoCommit/commit/rollback`, `ResultSet`).

## Run

    jbang TransactionCommitRollback.java
