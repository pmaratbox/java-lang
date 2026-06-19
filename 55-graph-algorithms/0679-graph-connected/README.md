# 0679 — Connectivity

Java's `JGraphT` library builds the weighted undirected graph G and uses `ConnectivityInspector.pathExists` to decide whether a path connects `a` and `e`. Because G is fully connected, the reachability check returns `true`.

## Run

    jbang GraphConnected.java
