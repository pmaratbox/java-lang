# 0322 — Lazy Filter + Take

From a lazy stream of naturals, filter the even ones and take three, printing `2 4 6`. Lazy `filter` then `limit(3)` short-circuits the infinite `iterate`.

## Run

    javac LazyFilterTake.java && java LazyFilterTake
