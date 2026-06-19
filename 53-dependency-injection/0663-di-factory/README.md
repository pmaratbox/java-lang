# 0663 — Factory provider

Uses the Guice DI container (`com.google.inject:guice`) to register the `Widget` service through a `@Provides` factory method rather than plain autowiring. The injector calls the factory to construct the object, then resolves it by interface type; calling `value()` on the resolved instance prints `built` — the value comes from running the factory through the container, not from a hardcoded literal.

## Run

    jbang DiFactory.java
