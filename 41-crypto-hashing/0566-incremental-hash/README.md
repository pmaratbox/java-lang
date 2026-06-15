# 0566 — Incremental hashing

Uses the Java Cryptography Architecture's `java.security.MessageDigest` with the
`SHA-256` algorithm to hash data incrementally. The hasher is fed `foo` and then
`bar` in two separate `update` calls before `digest` finalizes the computation,
producing the same result as hashing `foobar` in one shot. The 32-byte digest is
rendered as lowercase hex.

## Run

    jbang IncrementalHash.java
