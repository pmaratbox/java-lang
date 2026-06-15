# 0466 — Parse & access nested

Parse a JSON string and read a deeply nested value using Jackson's tree model. This lesson uses the real `com.fasterxml.jackson.core:jackson-databind` library: `ObjectMapper.readTree` builds a `JsonNode` tree, and `get(...)` navigation reaches `user.name` and the first element of the `roles` array.

## Run

    jbang ParseNestedAccess.java
