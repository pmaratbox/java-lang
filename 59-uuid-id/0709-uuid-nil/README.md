# 0709 — Nil UUID

The nil UUID is the special all-zero value. It is built directly with Java's stdlib `java.util.UUID` by passing both 64-bit halves as zero (`new UUID(0L, 0L)`); printing it yields the canonical all-zero form.

## Run

    jbang UuidNil.java
