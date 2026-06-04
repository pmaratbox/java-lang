# 0366 — Sparse Matrix

Store only nonzero entries; with (1,1)=5 set, read (1,1) (5) and (0,0) (0), printing `5 0`. A `HashMap` keyed by a packed (row,col) `long` returns 0 for any missing entry.

## Run

    javac SparseMatrix.java && java SparseMatrix
