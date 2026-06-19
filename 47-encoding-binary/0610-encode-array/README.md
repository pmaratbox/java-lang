# 0610 — Encode an array

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack:jackson-dataformat-msgpack`, pulled in via jbang `//DEPS`) — to encode
the array `[1, 2, 3]`. An `ObjectMapper` backed by a `MessagePackFactory` serializes the
`List` with `writeValueAsBytes`, and each byte is formatted as lowercase hex via
`String.format("%02x")`. A small array becomes a single-byte fixarray header (`93` for
length 3) followed by each positive-fixint element, so the result is `93010203` — the
bytes come from the library, never hardcoded.

## Run

    jbang EncodeArray.java
