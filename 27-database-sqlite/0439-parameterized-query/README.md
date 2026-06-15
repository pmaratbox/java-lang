# 0439 — Parameterized query

Bind a parameter to a query safely instead of concatenating strings. This lesson creates an in-memory SQLite table of users, inserts three rows, then runs `select name from users where id=?` with the value `2` bound through a JDBC `PreparedStatement`, printing the matching name (`bob`). Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC with `PreparedStatement.setInt` for safe parameter binding.

## Run

    jbang ParameterizedQuery.java
