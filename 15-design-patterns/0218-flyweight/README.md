# 0218 — Flyweight

Share flyweight instances for repeated characters a, b, a and print the number of distinct objects created `2`. A HashMap-backed factory caches one Glyph per key, so the repeated 'a' reuses its instance.

## Run

    javac Flyweight.java && java Flyweight
