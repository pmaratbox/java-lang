# 0509 — Nested object

Select a field through nested object types with the real graphql-java library. The schema defines `type Address { city }`, `type User { address }`, and `type Query { user }`. The `user` data fetcher returns nested maps, and graphql-java's default property resolution walks into each object type as the query selects deeper fields. The query `{ user { address { city } } }` is executed in-process (no HTTP server), and the printed value is read from `data.user.address.city`, not hardcoded.

## Run

    jbang NestedObject.java
