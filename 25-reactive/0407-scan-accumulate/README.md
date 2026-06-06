# 0407 — Scan (Running Fold)

Implement a scan operator that emits the running accumulation; produce the running sums of 1, 2, 3, 4. A one-element `int[]` captures the running state inside the subscribe lambda since Java closures need an effectively-final reference.

## Run

    javac ScanAccumulate.java && java ScanAccumulate
