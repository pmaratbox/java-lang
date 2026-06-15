# 0463 — Array of primitives

Serialize a list of integers to a compact JSON array. This lesson uses the real Jackson library (`com.fasterxml.jackson.core:jackson-databind`) and its `ObjectMapper.writeValueAsString` to turn a `List<Integer>` of `[1, 2, 3]` into the compact JSON array `[1,2,3]`.

## Run

    jbang ArrayOfPrimitives.java
