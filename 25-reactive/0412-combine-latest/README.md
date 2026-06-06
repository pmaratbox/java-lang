# 0412 — Combine Latest

Implement combineLatest of two timed streams, emitting the pair of latest values whenever either source emits (once both have emitted). A virtual-time PriorityQueue scheduler ordered by (time, insertion-seq) drives the deterministic timeline.

## Run

    javac CombineLatest.java && java CombineLatest
