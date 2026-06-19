# 0609 — Encode a boolean

Use the `jackson-dataformat-msgpack` library (Jackson's MessagePack backend) to MessagePack-encode the boolean `true`, then print the lowercase hex of the resulting bytes: `c3`. The boolean `true` serializes to the single byte `0xc3`.

## Run

    jbang EncodeBool.java
