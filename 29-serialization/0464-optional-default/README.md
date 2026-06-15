# 0464 — Optional field default

Deserialize JSON that is missing a field, falling back to a default. This lesson uses the Jackson `com.fasterxml.jackson.databind.ObjectMapper` and its `readValue` method to parse `{"name":"alice"}` (the `age` field is absent) into a `Person` record. Because `age` is a primitive `int`, Jackson leaves it at its default value `0`, then prints `name age` -> `alice 0`. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang OptionalDefault.java
