# 0612 — Encode a map

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack:jackson-dataformat-msgpack`, pulled in via jbang `//DEPS`) — to encode
the single-key map `{"a": 1}`. An `ObjectMapper` backed by a `MessagePackFactory` serializes
the value with `writeValueAsBytes`, and each byte is formatted as lowercase hex via
`String.format("%02x")`. MessagePack packs a small map as a `fixmap` (`81` for one pair),
followed by the key `"a"` (`a161`) and the value `1` (`01`), so the bytes are `81a16101` —
produced by the library, never hardcoded. A single key avoids any key-order ambiguity.

## Run

    jbang EncodeMap.java
