# 0657 — Resolve a service

Uses the Guice DI container (`com.google.inject:guice`) to bind the `Greeter` interface to its `GreeterImpl` implementation as a singleton inside an `AbstractModule`. The `Injector` resolves a `Greeter` instance from the configured graph, and calling `greet()` on the resolved service returns and prints `hello`.

## Run

    jbang DiResolve.java
