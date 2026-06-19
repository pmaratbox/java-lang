# 0659 — Singleton lifetime

Uses the Google Guice DI container (`com.google.inject:guice`). The `Repo` interface is bound to `RepoImpl` in `Scopes.SINGLETON`, so the container caches a single instance. We resolve `Repo` twice via `injector.getInstance(Repo.class)` and print whether the two references are the same instance (identity) — Guice returns the cached singleton both times, so it prints `true`.

## Run

    jbang DiSingleton.java
