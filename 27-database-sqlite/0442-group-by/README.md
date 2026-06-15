# 0442 — Group by

Aggregate amounts per group. This lesson creates an in-memory SQLite table of sales rows, inserts five `(category, amount)` pairs across two categories, then runs `select category,sum(amount) from sales group by category order by category` to total the amounts within each group, printing each result as `category sum`. Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC, letting SQL's `GROUP BY` and `SUM` do the aggregation.

## Run

    jbang GroupBy.java
