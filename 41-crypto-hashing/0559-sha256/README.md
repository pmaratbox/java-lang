# 0559 — SHA-256

Uses Java's built-in cryptography library (the JCA `java.security.MessageDigest`)
to compute the *SHA-256* digest of the UTF-8 bytes of the fixed string `hello`.
The raw digest bytes are formatted as a lowercase hex string via
`String.format("%02x", b)` — the hash is computed by the library, never
hardcoded.

## Run

    jbang Sha256.java
