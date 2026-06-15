# 0556 — Matrix multiply

Uses the [EJML](https://ejml.org/) (Efficient Java Matrix Library) numeric
library to multiply two 2x2 matrices. Two `SimpleMatrix` instances are built
from `[[1,2],[3,4]]` and `[[5,6],[7,8]]`, and `a.mult(b)` computes their matrix
product with the library's linear-algebra routine. Each result element is
rounded to an integer and the rows are printed as space-joined integers.

## Run

    jbang MatrixMultiply.java
