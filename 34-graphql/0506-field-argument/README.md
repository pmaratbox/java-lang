# 0506 — Field argument

Pass an argument to a field using the real graphql-java library. The schema declares `Query.greet(name: String!): String`, and the data fetcher reads the supplied argument with `env.getArgument("name")` and returns `"hello " + name`. The query `{ greet(name: "alice") }` is executed in-process and the printed value is extracted from the execution result's data map.

## Run

    jbang FieldArgument.java
