# 0613 — Encode null

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack:jackson-dataformat-msgpack`) — to encode the nil value `null`. An
`ObjectMapper` wrapping a `MessagePackFactory` serializes `null` with
`writeValueAsBytes`, and each byte is formatted as lowercase hex with
`String.format("%02x", ...)`, printing `c0` — the single nil byte produced by the
library, never hardcoded.

## Run

    jbang EncodeNull.java
