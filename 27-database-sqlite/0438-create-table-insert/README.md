# 0438 — Create table & insert

Create a table, insert rows, and select them back. This lesson opens an in-memory SQLite database via JDBC's `DriverManager`, creates a `users(id integer, name text)` table, inserts three rows with a parameterized `PreparedStatement`, then runs `select name from users order by id` and prints each name on its own line. Uses the real `org.xerial:sqlite-jdbc` driver.

## Run

    jbang CreateTableInsert.java
