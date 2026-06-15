# 0511 — Mutation

Execute a mutation using the real graphql-java library. The schema declares `Mutation.addUser(name: String!): User`, and the data fetcher reads the supplied argument with `env.getArgument("name")` and returns a `User` object (a `Map` with a `name` field). The mutation `mutation { addUser(name: "bob") { name } }` is executed in-process and the printed value is extracted from the execution result's data map.

## Run

    jbang Mutation.java
