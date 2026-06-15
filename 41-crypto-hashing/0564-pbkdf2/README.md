# 0564 — PBKDF2

Uses the Java Cryptography Architecture (JCA) `SecretKeyFactory` with the
`PBKDF2WithHmacSHA256` algorithm to derive a key from the password `password`
and salt `salt` over 1000 iterations, producing a 32-byte derived key. The key
is printed as lowercase hex via `String.format("%02x", b)`.

## Run

    jbang Pbkdf2.java
