# 0328 — Trampoline

Sum 1..100 with a trampolined recursion that avoids deep stacks, printing `5050`. Each step returns a `More` thunk or a `Done`, driven in a `while` loop instead of the call stack.

## Run

    javac Trampoline.java && java Trampoline
