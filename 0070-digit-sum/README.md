# 0070 — Digit Sum

Sum the decimal digits of `1234` (repeatedly take the last digit with `% 10` and drop it with `/ 10`) and print the total: `10`. Integer division `n /= 10` drops the digit that `n % 10` peeled off, until `n` reaches zero.

## Run

    javac DigitSum.java && java DigitSum
