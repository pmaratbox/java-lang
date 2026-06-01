# 0054 — Resource Cleanup & Defer

Acquire a resource, use it, and let the language release it automatically at scope exit, printing `open`, `use`, and `close` in that order. Try-with-resources (`try (var r = ...)`) calls `close()` on any `AutoCloseable` when the block exits, in reverse order of acquisition.

## Run

    javac ResourceCleanup.java && java ResourceCleanup
