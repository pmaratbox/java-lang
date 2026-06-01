# 0019 — Recursion

Define a recursive `factorial(n)` that multiplies `n` by `factorial(n - 1)` until it bottoms out at `1`, then print `factorial(5) = 120`. The JVM performs no tail-call optimization, so each call consumes a stack frame and deep recursion throws `StackOverflowError`. `long` (64-bit) is used because `factorial` overflows a 32-bit `int` almost immediately.

## Run

    javac Recursion.java && java Recursion
