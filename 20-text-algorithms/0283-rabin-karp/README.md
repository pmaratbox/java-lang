# 0283 — Rabin-Karp Search

Use rolling-hash Rabin-Karp to find all start indices of "ab" in "xabxab", printing `1 4`. Java rolls a long modular hash and confirms candidates with String.regionMatches.

## Run

    javac RabinKarp.java && java RabinKarp
