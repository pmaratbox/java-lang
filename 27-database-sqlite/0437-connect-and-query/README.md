# 0437 — Connect & query

Open an in-memory SQLite database and run a single query. This lesson opens a `:memory:` connection via JDBC's `DriverManager`, executes `select 42` with a `Statement`, and prints the single integer result read from the `ResultSet`. Uses the real `org.xerial:sqlite-jdbc` driver.

## Run

    jbang ConnectAndQuery.java
