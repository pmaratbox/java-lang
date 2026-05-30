# 0014 — Higher-Order Functions

Write `apply(f, x)` that calls the function `f` on `x`, then pass it two
different functions, `inc` and `double`. Java models functions as **functional
interfaces** — here `IntUnaryOperator` (an `int -> int`) — and lambdas like
`x -> x + 1` create instances. (The doubling lambda is `dbl` because `double` is
a reserved type keyword.)

## Run

    javac HigherOrder.java && java HigherOrder
