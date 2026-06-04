# 0324 — Either Monad

Chain Either computations: a successful divide chain yields 2, and a divide-by-zero yields an error, printing `2 err`. `bind` propagates `Right` and short-circuits to `Left`, with `fold` extracting either side.

## Run

    javac EitherMonad.java && java EitherMonad
