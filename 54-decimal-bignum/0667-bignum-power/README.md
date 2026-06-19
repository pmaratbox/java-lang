# 0667 — Big integer power

Uses java's arbitrary-precision `java.math.BigInteger` type to compute 2 raised to the 100th power exactly. `BigInteger.TWO.pow(100)` returns the full 31-digit value `1267650600228229401496703205376` with no overflow or rounding — far beyond the range of `long`.

## Run

    jbang BignumPower.java
