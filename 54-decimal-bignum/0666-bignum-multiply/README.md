# 0666 — Big integer multiplication

Uses java's arbitrary-precision `java.math.BigInteger` type to multiply two large integers exactly. `BigInteger.valueOf(123456789).multiply(BigInteger.valueOf(987654321))` computes the full product `121932631112635269` with no overflow or rounding.

## Run

    jbang BignumMultiply.java
