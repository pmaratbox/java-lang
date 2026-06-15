# 0508 — List field

Define a GraphQL schema with the real `graphql-java` library where `Query.numbers` is the list type `[Int]`. A data fetcher resolves the field to `[1, 2, 3]`, the schema is built in-process, and the query `{ numbers }` is executed (no HTTP server). Each element is extracted from the execution result's data list and printed on its own line.

## Run

    jbang ListField.java
