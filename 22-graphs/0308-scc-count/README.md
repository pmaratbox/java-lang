# 0308 — Strongly Connected Components

Count the strongly connected components of 0->1,1->2,2->0,2->3, printing `2`. Tarjan's DFS tracks ids/low-links with an `ArrayDeque` stack.

## Run

    javac SccCount.java && java SccCount
