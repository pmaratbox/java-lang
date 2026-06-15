# 0558 — Scalar multiply

Uses the [EJML](https://ejml.org/) (`org.ejml.simple.SimpleMatrix`) numeric
linear-algebra library. We build the matrix `[[1,2],[3,4]]` and apply the
library's *scalar multiplication* via `scale(3)`, which multiplies every element
by 3. The resulting matrix is read back element-by-element with `get(i,j)` and
each row is printed as space-joined integers — the values are computed by the
library, never hardcoded.

## Run

    jbang ScalarMultiply.java
