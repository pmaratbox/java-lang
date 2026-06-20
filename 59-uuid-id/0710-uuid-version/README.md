# 0710 — UUID version

This lesson parses a UUID string with the standard `java.util.UUID` library (`UUID.fromString`) and reads its version number via `UUID.version()`. The UUID `550e8400-e29b-41d4-a716-446655440000` is a version-4 (random) UUID, so the version is `4`.

## Run

    jbang UuidVersion.java
