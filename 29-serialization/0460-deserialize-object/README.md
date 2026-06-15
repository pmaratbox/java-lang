# 0460 — Deserialize an object

Parse a JSON string into a typed object. This lesson uses the Jackson `com.fasterxml.jackson.databind.ObjectMapper` and its `readValue` method to deserialize `{"age":30,"name":"alice"}` into a `Person` record, then prints `name age`. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang DeserializeObject.java
