# 0563 — HMAC-SHA256

Uses Java's built-in `javax.crypto` JCA library to compute an HMAC-SHA256
message authentication code. A `Mac` instance for `HmacSHA256` is keyed with a
`SecretKeySpec` wrapping the key `key`, then `doFinal` authenticates the message
`hello`. The resulting bytes are rendered as a lowercase hex digest.

## Run

    jbang HmacSha256.java
