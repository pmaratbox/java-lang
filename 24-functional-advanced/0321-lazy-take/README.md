# 0321 — Lazy Take

Build a lazy sequence of the natural numbers and take the first five, printing `1 2 3 4 5`. A `Stream.iterate` is lazy, so `limit(5)` only pulls the first five.

## Run

    javac LazyTake.java && java LazyTake
