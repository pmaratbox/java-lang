# 0195 — Defer LIFO Order

Register three deferred actions printing 1, 2, 3 and show they run in last-in-first-out order `3 2 1`. Java has no `defer`, so a `Deque` used as a stack emulates the LIFO unwinding order.

## Run

    javac LifoOrder.java && java LifoOrder
