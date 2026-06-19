# 0668 — Factorial

Compute 30! (factorial) exactly with Java's `java.math.BigInteger`, an arbitrary-precision integer type. Multiplying the integers 1 through 30 with `BigInteger.multiply` overflows `long` long before the end, but big integers grow as needed and return the exact product `265252859812191058636308480000000`.

## Run

    jbang BignumFactorial.java
