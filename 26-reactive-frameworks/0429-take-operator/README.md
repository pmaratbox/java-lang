# 0429 — Take Operator

Use the library's take operator to take the first 3 values of an unbounded stream, then complete. Built with Project Reactor's `take(3)` on a `Flux.range` source, completing via the subscribe onComplete callback.

## Run

    jbang TakeOperator.java
