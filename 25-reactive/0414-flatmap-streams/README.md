# 0414 — FlatMap (mergeMap)

Implement flatMap/mergeMap: map each outer value to an inner timed stream and merge all inners concurrently (no cancellation). In Java each inner subscribes via a fresh anonymous Observer that forwards to the downstream, while a shared virtual-clock PriorityQueue interleaves all inners deterministically.

## Run

    javac FlatmapStreams.java && java FlatmapStreams
