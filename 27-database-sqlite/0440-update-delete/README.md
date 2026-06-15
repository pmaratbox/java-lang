# 0440 — Update & delete

Create an in-memory SQLite table of users, insert three rows, then modify one row with an `UPDATE` and remove another with a `DELETE`, and finally read the remaining rows back with a `SELECT ... ORDER BY id`. Uses the real `org.xerial:sqlite-jdbc` driver via raw JDBC (`DriverManager`, `PreparedStatement`, `ResultSet`).

## Run

    jbang UpdateDelete.java
