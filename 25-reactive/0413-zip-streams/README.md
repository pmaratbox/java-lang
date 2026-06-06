# 0413 — Zip Streams

Implement zip that pairs values by index and combines them; zip [1,2,3] with [10,20,30] using a+b. Each source buffers into an ArrayDeque, and a drain step pairs heads whenever both queues are non-empty.

## Run

    javac ZipStreams.java && java ZipStreams
