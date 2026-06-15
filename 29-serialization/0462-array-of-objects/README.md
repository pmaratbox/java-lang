# 0462 — Array of objects

Serialize a `List` of typed objects into a JSON array. This lesson uses Jackson's `ObjectMapper.writeValueAsString` to turn a `List<Person>` into a compact JSON array, where each element is a `Person` record. Record components are declared alphabetically (`age` before `name`) so the emitted keys come out in alphabetical order. Uses the real `com.fasterxml.jackson.core:jackson-databind` library.

## Run

    jbang ArrayOfObjects.java
