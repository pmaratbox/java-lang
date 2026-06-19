# 0680 — Topological sort

Java's `JGraphT` library builds the DAG (`a->b`, `b->c`, `a->c`, `c->d`, `d->e`) with `DirectedAcyclicGraph` and computes its topological order using `TopologicalOrderIterator`. The order is unique: `a,b,c,d,e`.

## Run

    jbang GraphTopologicalSort.java
