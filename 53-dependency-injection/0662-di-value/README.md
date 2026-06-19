# 0662 — Inject a value

Uses the Guice DI container (`com.google.inject:guice`) to register a constant configuration value `v1` via `bindConstant().annotatedWith(Names.named("apiKey"))`. The `Config` service receives it through an `@Inject @Named("apiKey")` field, and `get()` returns it. The injector resolves the graph and the printed `v1` comes from resolving through the container, not from a hardcoded literal in the service.

## Run

    jbang DiValue.java
