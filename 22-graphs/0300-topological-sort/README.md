# 0300 — Topological Sort

Topologically sort the DAG 0->1,0->2,1->3,2->3 using the Kahn algorithm (smallest index first), printing `0 1 2 3`. A min-`PriorityQueue` of zero-indegree nodes enforces the tie-break.

## Run

    javac TopologicalSort.java && java TopologicalSort
