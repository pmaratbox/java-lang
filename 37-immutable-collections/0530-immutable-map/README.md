# 0530 — Immutable map

Vavr's `io.vavr.collection.HashMap` is a persistent (immutable) map. Calling `.put(key, value)` does not mutate the receiver — it RETURNS A NEW map sharing structure with the original, while the original stays unchanged. Here `{a:1}.put("b", 2)` yields a new map whose sorted keys are `a b`, and the original's keys remain `a`.

## Run

    jbang ImmutableMap.java
