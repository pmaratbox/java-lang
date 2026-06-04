# 0326 — Monoid Fold

Fold lists under two monoids: string concat ["a","b","c"]->"abc" and integer sum [1,2,3]->6, printing `abc 6`. A generic `fold` takes an identity and a `BinaryOperator` combine, reused for both monoids.

## Run

    javac MonoidFold.java && java MonoidFold
