# 0661 — Multiple dependencies

Uses the Guice DI container (`com.google.inject:guice`) to register two services, `A` (bound to `AImpl`) and `B` (bound to `BImpl`), each as a singleton. The `Service` declares both as `@Inject` fields, so the injector resolves the whole graph when asked for `Service`. Calling `run()` returns `x() + y()`, printing `ab` — the value comes from resolving both dependencies through the container, not from a hardcoded literal.

## Run

    jbang DiMultipleDeps.java
