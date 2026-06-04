# 0101 — Threads: Spawn and Join

Spawn 3 worker threads, wait for all of them to finish, then print `done: 3`. In Java a `Thread` runs a `Runnable`, and `join()` blocks until that thread completes.

## Run

    javac SpawnJoin.java && java SpawnJoin
