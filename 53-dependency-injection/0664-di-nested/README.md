# 0664 — Nested dependency chain

Uses the Google Guice DI container (`com.google.inject:guice`). Three services form a 3-level chain: `A.v()` returns `a`, `B` declares an `@Inject A` and `v()` returns `A.v()+b`, and `C` declares an `@Inject B` and `v()` returns `B.v()+c`. Resolving `C` from the injector makes Guice walk the whole graph — constructing `A`, injecting it into `B`, then injecting `B` into `C` — so calling `v()` prints `abc`.

## Run

    jbang DiNested.java
