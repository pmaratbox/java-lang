# 0444 — Inner join

Join two tables on a shared key with SQL. This lesson creates in-memory SQLite tables `users` (id, name) and `orders` (user_id, item), inserts the users alice and bob plus three orders, then runs `select u.name,o.item from orders o join users u on u.id=o.user_id order by u.name,o.item` and prints each result row as `name item` (space-separated). Uses the real `org.xerial:sqlite-jdbc` driver over raw JDBC, iterating the joined rows from a `ResultSet`.

## Run

    jbang InnerJoin.java
