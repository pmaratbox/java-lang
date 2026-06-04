# 0323 — Maybe Monad

Chain Maybe operations: Some(2) then +3 then *2 gives 10, and a None chain yields the fallback, printing `10 none`. A tiny generic `Maybe<T>` with `bind`/`map` short-circuits on `none()`.

## Run

    javac MaybeMonad.java && java MaybeMonad
