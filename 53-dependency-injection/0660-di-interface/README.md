# 0660 — Bind interface to impl

Uses the Guice DI container (`com.google.inject:guice`) to bind the `Animal` interface to its `Dog` implementation as a singleton. The injector resolves the graph by the interface type, and calling `sound()` on the resolved instance prints `woof` — the value comes from resolving through the container, not from a hardcoded literal.

## Run

    jbang DiInterface.java
