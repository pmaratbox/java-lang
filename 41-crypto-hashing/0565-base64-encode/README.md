# 0565 — Base64 encode

Uses Java's standard library encoder (`java.util.Base64.getEncoder()`) to
*Base64-encode* the UTF-8 bytes of the fixed string `hello`. The encoder
produces the canonical Base64 string `aGVsbG8=`, computed by the library rather
than hardcoded.

## Run

    jbang Base64Encode.java
