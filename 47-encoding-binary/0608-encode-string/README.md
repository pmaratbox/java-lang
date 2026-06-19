# 0608 — Encode a string

Uses Java's real MessagePack library — [jackson-dataformat-msgpack](https://github.com/msgpack/msgpack-java)
(`org.msgpack.jackson.dataformat`) — to encode the fixed string `"hello"`. An
`ObjectMapper` built on a `MessagePackFactory` serializes the value with
`writeValueAsBytes`, and each byte is formatted as lowercase hex via
`String.format("%02x", ...)`, printing `a568656c6c6f` (fixstr `a5` + the UTF-8
bytes of `hello`) — the bytes come from the library, never hardcoded.

## Run

    jbang EncodeString.java
