# 0406 — Filter Operator

Implement a filter operator that forwards only values passing a predicate, keeping the even numbers of 1..6. In Java the operator is a `Consumer`-based Observable that wraps the source subscription and only calls `onNext` when the `Predicate` accepts the value.

## Run

    javac FilterOperator.java && java FilterOperator
