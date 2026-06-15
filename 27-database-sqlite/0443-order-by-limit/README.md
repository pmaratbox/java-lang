# 0443 — Order by & limit

Creates an in-memory SQLite table of integer scores, inserts six values, then runs `select value from scores order by value desc limit 3` to sort descending and take the top rows, printing each value on its own line. Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC with a `DriverManager` connection to `jdbc:sqlite::memory:`.

## Run

    jbang OrderByLimit.java
