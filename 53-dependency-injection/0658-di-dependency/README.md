# 0658 — Inject a dependency

Uses the Google Guice DI container (`com.google.inject:guice`). A `Service` declares an `@Inject Repo` field, and the module binds the `Repo` interface to `RepoImpl` (whose `data()` returns `data`). Resolving `Service` from the injector makes Guice walk the dependency graph, construct `RepoImpl`, and inject it; calling `run()` delegates to the resolved repo and prints `data`.

## Run

    jbang DiDependency.java
