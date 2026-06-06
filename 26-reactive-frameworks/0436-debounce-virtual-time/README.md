# 0436 — Debounce (Virtual Time)

Use the library's debounce operator on a virtual/test scheduler to emit a value only after a quiet window. Project Reactor has no `debounce`; we use `sampleTimeout(v -> Mono.delay(...))` driven by a `VirtualTimeScheduler`.

## Run

    jbang DebounceVirtualTime.java
