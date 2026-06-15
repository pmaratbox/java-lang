# 0468 — Scalar types

Serialize the three basic scalar kinds — `boolean`, `int`, and `String` — in one object. This lesson uses Jackson's `ObjectMapper.writeValueAsString` to serialize a `record` whose components are declared alphabetically (`active`, `count`, `label`), producing compact JSON with a lowercase boolean (`true`) and a bare integer. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang ScalarTypes.java
