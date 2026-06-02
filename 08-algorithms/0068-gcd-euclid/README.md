# 0068 — GCD (Euclid)

Compute the greatest common divisor of `48` and `36` with Euclid's algorithm (repeatedly replace the pair with `(b, a % b)` until the remainder is zero) and print it: `12`. A temporary `t` advances the pair each step; `BigInteger` also has a built-in `gcd` for big numbers.

## Run

    javac Gcd.java && java Gcd
