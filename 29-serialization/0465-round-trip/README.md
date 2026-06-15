# 0465 — Round trip

Serialize an object to JSON and deserialize it straight back. This lesson uses Jackson's `ObjectMapper` (`com.fasterxml.jackson.core:jackson-databind`): `writeValueAsString` turns a `Person(age, name)` record into compact JSON with alphabetical keys (component declaration order), then `readValue` parses that JSON back into a `Person`, and the recovered name is printed.

## Run

    jbang RoundTrip.java
