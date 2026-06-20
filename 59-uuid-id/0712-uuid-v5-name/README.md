# 0712 — UUIDv5 of another name

This lesson generates a deterministic UUIDv5 with the `java-uuid-generator` (JUG) library (`com.fasterxml.uuid.Generators.nameBasedGenerator`). UUIDv5 hashes the namespace plus the name with SHA-1, so the value is name-dependent — using the DNS namespace `6ba7b810-9dad-11d1-80b4-00c04fd430c8` with the name `test.com` yields a different UUID than `example.com`.

## Run

    jbang UuidV5Name.java
