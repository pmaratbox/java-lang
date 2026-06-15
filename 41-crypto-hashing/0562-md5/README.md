# 0562 — MD5

Uses the Java Cryptography Architecture (JCA) `java.security.MessageDigest`
class with the `MD5` algorithm to compute the 128-bit digest of the fixed string
`hello`. Each digest byte is formatted with `%02x` to produce the lowercase
hexadecimal string `5d41402abc4b2a76b9719d911017c592`.

## Run

    jbang Md5.java
