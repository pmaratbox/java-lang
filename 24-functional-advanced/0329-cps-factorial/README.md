# 0329 — CPS Factorial

Compute 5! in continuation-passing style, printing `120`. Each step threads a `Function` continuation, and the top-level call passes identity.

## Run

    javac CpsFactorial.java && java CpsFactorial
