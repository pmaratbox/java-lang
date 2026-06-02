# 0057 — Sieve of Eratosthenes

Use the Sieve of Eratosthenes to find every prime number up to `10` and print them: `2 3 5 7`. `Arrays.fill` seeds the `boolean[]` true; multiples are struck from `i*i`, and the bound `i*i <= n` replaces a square-root computation.

## Run

    javac Sieve.java && java Sieve
