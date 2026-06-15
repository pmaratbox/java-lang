# 0561 — SHA-1

Uses the Java Cryptography Architecture (JCA) `java.security.MessageDigest` with
the **SHA-1** algorithm to hash the fixed string `"hello"`. The raw 20-byte
digest returned by `digest(...)` is formatted into a lowercase hex string with
`String.format("%02x", b)` and printed with no separators. The digest is
computed by the library, never hardcoded. SHA-1 is legacy and cryptographically
broken — it is shown here only for completeness.

## Run

    jbang Sha1.java
