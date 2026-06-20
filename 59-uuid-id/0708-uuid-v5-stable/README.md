# 0708 — UUIDv5 is stable

This lesson generates a UUIDv5 with the `java-uuid-generator` (JUG) library (`com.fasterxml.uuid.Generators.nameBasedGenerator`) twice from the same `(namespace, name)` pair — the DNS namespace `6ba7b810-9dad-11d1-80b4-00c04fd430c8` and the name `example.com` — then prints whether the two results are equal. Because UUIDv5 hashes namespace plus name with SHA-1 (no randomness), it is deterministic, so the comparison is `true`.

## Run

    jbang UuidV5Stable.java
