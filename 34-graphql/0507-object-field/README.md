# 0507 — Object field

Return an object type and select one of its fields with the real graphql-java library. The schema `type User { name: String } type Query { user: User }` is parsed from SDL and wired to a data fetcher that resolves `user` to a map `{name: "alice"}`. The query `{ user { name } }` is executed in-process (no HTTP server), and the printed value is read by navigating the execution result's `data` map down to `data.user.name`, not hardcoded.

## Run

    jbang ObjectField.java
