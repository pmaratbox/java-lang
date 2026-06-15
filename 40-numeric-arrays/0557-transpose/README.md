# 0557 — Transpose

Uses the [EJML](https://ejml.org) (Efficient Java Matrix Library)
`SimpleMatrix` type. We build the 2x3 matrix `[[1,2,3],[4,5,6]]` and call
the library's `transpose()` operation to flip rows and columns into a 3x2
matrix. Each transposed row is printed as space-joined integers.

## Run

    jbang Transpose.java
