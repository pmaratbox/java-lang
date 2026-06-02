# 0030 — Variadic Functions

Define a function that accepts a variable number of integer arguments and returns their total, then call it with `1, 2, 3` to print `sum: 6`. A trailing `int... nums` parameter is Java varargs; the compiler bundles the arguments into an `int[]` that the method iterates. Passing an array directly also works, since varargs *is* an array.

## Run

    javac Variadic.java && java Variadic
