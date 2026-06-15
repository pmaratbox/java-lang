# 0512 — Query variables

Execute a query with variables using the real graphql-java library. The schema declares `Query.item(id: Int!): Item` where `Item` has an `id: Int` field. The query `query($id: Int!) { item(id: $id) { id } }` is run in-process via `ExecutionInput`, with the `$id` variable supplied through the execution's variables map (`{id: 42}`) rather than interpolated into the query string. The printed value is extracted from the execution result's data map.

## Run

    jbang Variables.java
