# 0405 — Map Operator

Implement a map operator that transforms each emitted value, applying x => x*2 to a stream of 1, 2, 3, 4. In Java, the operator returns a new Observable whose lambda forwards f(value) to the downstream observer.

## Run

    javac MapOperator.java && java MapOperator
