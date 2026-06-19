# 0611 — Encode a nested array

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack:jackson-dataformat-msgpack`, pulled in via jbang `//DEPS`) — to encode
the nested array `[[1, 2], [3, 4]]`. An `ObjectMapper` backed by a `MessagePackFactory`
serializes the value with `writeValueAsBytes`, and each byte is formatted as lowercase
hex via `String.format("%02x")`. MessagePack writes each fixarray as a `9N` header
followed by its elements, so the outer two-element array `92` wraps two inner arrays
`9201 02` and `9203 04`, yielding `92920102920304` — the bytes come from the library,
never hardcoded.

## Run

    jbang EncodeNestedArray.java
