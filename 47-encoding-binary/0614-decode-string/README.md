# 0614 — Decode bytes

Uses Jackson's `jackson-dataformat-msgpack` (the MessagePack data format for Jackson) to DECODE binary data. The fixed hex string `a568656c6c6f` is converted to raw bytes and `ObjectMapper.readValue` parses it as MessagePack, yielding the string `hello` (fixstr `a5` followed by the UTF-8 bytes of "hello").

## Run

    jbang DecodeString.java
