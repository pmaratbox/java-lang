# 0428 — Scan (Running Fold)

Use the library's scan operator to emit the running sum of 1, 2, 3, 4. Project Reactor's scan(0, (acc, x) -> acc + x) emits the seed first, so skip(1) drops it to yield 1, 3, 6, 10.

## Run

    jbang ScanAccumulate.java
