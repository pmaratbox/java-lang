# 0408 — Take Operator

Implement take(n) over an unbounded source of the natural numbers, emitting the first 3 then completing (and unsubscribing the source). A boolean[] flag checked between emissions lets the unsubscribe handle halt the otherwise-infinite producer loop.

## Run

    javac TakeOperator.java && java TakeOperator
