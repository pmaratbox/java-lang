# 0505 — Hello query

Execute a simple GraphQL query in-process with the real graphql-java library. The schema `type Query { hello: String }` is parsed from SDL, wired to a data fetcher that resolves `hello` to `world`, and compiled into an executable schema. The query `{ hello }` is executed in-process (no HTTP server), and the printed value is read from the execution result's `data` map, not hardcoded.

## Run

    jbang HelloQuery.java
