# 0032 — Math Functions

Take the square root of `16`, raise `2` to the 10th power, the absolute value of `-5`, and the larger of `3` and `9`, printing `sqrt: 4`, `pow: 1024`, `abs: 5`, and `max: 9`. `java.lang.Math` (auto-imported) offers `sqrt` and `pow` (returning `double`, cast to `int`) plus overloaded `abs` and `max`. `Math.pow` is always floating-point; `Math.multiplyExact` and `BigInteger.pow` cover exact integer powers.

## Run

    javac MathFunctions.java && java MathFunctions
