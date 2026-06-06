# 0411 — Concat Streams

Implement concat: subscribe to the second source only after the first completes; concat [1,2] then [3,4]. The combinator chains an inner `Observer` whose `complete` subscribes to the next source, all synchronously.

## Run

    javac ConcatStreams.java && java ConcatStreams
