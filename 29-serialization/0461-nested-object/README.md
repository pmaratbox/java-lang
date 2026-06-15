# 0461 — Nested object

Serialize an object that contains another object. This lesson uses Jackson's `ObjectMapper.writeValueAsString` to serialize a `Person` record whose `address` component is itself an `Address` record. Declaring record components in alphabetical order (and `address` before `name`, `city` before `zip`) yields compact JSON with alphabetical keys. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang NestedObject.java
