# 0421 — Debounce (Virtual Time)

Implement debounce(window) on a virtual-time scheduler: emit a value only after a quiet gap of `window` ticks with no newer value. In Java a `PriorityQueue` with a `(time, seq)` comparator drives the scheduler, and a one-element array captures the mutable pending token from the lambda.

## Run

    javac DebounceVirtualTime.java && java DebounceVirtualTime
