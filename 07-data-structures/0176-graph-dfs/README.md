# 0176 — Graph DFS

Depth-first traverse from node 0 of the graph 0:[1,2] 1:[0,3] 2:[0,3] 3:[1,2], printing visit order `0 1 3 2`. Recursion over neighbors in list order, guarded by a visited array, expresses DFS directly via the call stack.

## Run

    javac Dfs.java && java Dfs
