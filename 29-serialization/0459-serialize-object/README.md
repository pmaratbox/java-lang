# 0459 — Serialize an object

Serialize a typed object to a compact JSON string. This lesson defines a `Person(age, name)` record with components in alphabetical order and serializes it with Jackson's `ObjectMapper.writeValueAsString`. Jackson emits compact JSON (no spaces), and the alphabetical declaration order yields alphabetically ordered keys. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang SerializeObject.java
