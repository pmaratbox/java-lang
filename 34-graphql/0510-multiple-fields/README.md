# 0510 — Multiple fields

Execute a GraphQL query in-process with the real graphql-java library, selecting several fields of an object at once. The schema defines `type User { name: String age: Int }` with a `user` query field, wired to a data fetcher that resolves to a map. The query `{ user { name age } }` requests both fields; the resolved `name` and `age` are read from the execution result's `data` map (not hardcoded) and printed on separate lines.

## Run

    jbang MultipleFields.java
