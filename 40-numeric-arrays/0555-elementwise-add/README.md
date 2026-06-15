# 0555 — Element-wise add

Uses the [EJML](https://ejml.org/) numeric library (`org.ejml.simple.SimpleMatrix`,
double-backed). We build the row vectors `[1, 2, 3]` and `[10, 20, 30]` and call
`.plus()` to add them element-wise. The result is printed as space-joined integers
(each cell rounded and cast to `int`) -> `11 22 33`.

## Run

    jbang ElementwiseAdd.java
