# 0707 — UUIDv5 (name-based)

This lesson generates a deterministic UUIDv5 with the `java-uuid-generator` (JUG) library (`com.fasterxml.uuid.Generators.nameBasedGenerator`). UUIDv5 hashes the namespace plus the name with SHA-1, so the same `(namespace, name)` pair always yields the same UUID — here the DNS namespace `6ba7b810-9dad-11d1-80b4-00c04fd430c8` and the name `example.com`.

## Run

    jbang UuidV5.java
