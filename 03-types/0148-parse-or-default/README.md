# 0148 — Parse or Default

Parse "42" to 42 and "x" (invalid) to a default 0, printing `42 0`. Java catches `NumberFormatException` from `Integer.parseInt` to supply the fallback.

## Run

    javac OrDefault.java && java OrDefault
