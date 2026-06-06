# 0424 — Signal + Computed

Implement fine-grained reactivity: a writable signal and a derived computed that recomputes when its dependency changes. The signal keeps a subscriber list and the computed registers a recompute callback caching its value, all synchronous.

## Run

    javac ReactiveSignalComputed.java && java ReactiveSignalComputed
