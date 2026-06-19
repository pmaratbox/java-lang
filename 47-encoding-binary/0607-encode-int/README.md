# 0607 — Encode an integer

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack:jackson-dataformat-msgpack`, pulled in via jbang `//DEPS`) — to encode
the integer `42`. An `ObjectMapper` backed by a `MessagePackFactory` serializes the value
with `writeValueAsBytes`, and each byte is formatted as lowercase hex via `String.format("%02x")`.
MessagePack stores small non-negative integers as a single-byte positive fixint, so `42`
becomes `2a` — the bytes come from the library, never hardcoded.

## Run

    jbang EncodeInt.java
