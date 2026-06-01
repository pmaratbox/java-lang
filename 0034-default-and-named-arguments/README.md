# 0034 — Default & Named Arguments

Give a `greet` function a default greeting, then call it once without the greeting and once overriding it, printing `Hello, Ada` and `Hi, Ada`. Java has no default or named arguments; the standard answer is *method overloading* — a one-argument `greet` that delegates to the two-argument one with the default. The builder pattern handles many optional parameters.

## Run

    javac DefaultArgs.java && java DefaultArgs
