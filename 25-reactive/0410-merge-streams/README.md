# 0410 — Merge Streams

Implement merge of two timed streams using a virtual-time scheduler, interleaving them by emission time. A `PriorityQueue` ordered by (time, insertion seq) drains the scheduled emissions in deterministic order.

## Run

    javac MergeStreams.java && java MergeStreams
