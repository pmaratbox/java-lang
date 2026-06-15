# 0441 — Aggregate functions

Compute summary statistics over a column with SQL aggregate functions. This lesson creates an in-memory SQLite table `t`, inserts the amounts 10, 20, 30, 40, 50, then runs `select count(*),sum(amount),min(amount),max(amount) from t` and prints the four resulting values (count, sum, min, max) each on its own line. Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC, reading the single aggregate row from a `ResultSet`.

## Run

    jbang AggregateFunctions.java
