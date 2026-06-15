# 0560 — SHA-512

Uses the Java Cryptography Architecture (JCA) `java.security.MessageDigest`
class to compute the SHA-512 hash of the fixed string `hello`. The raw digest
bytes are formatted with `String.format("%02x", b)` to produce a lowercase hex
string with no separators.

## Run

    jbang Sha512.java
