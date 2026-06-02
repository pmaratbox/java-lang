# 0038 — String Methods

Split `"a,b,c"` on commas, upper-case each part, and join them with `-`, printing `A-B-C`. `String.split(",")` returns a `String[]` (it actually takes a regex), and a stream maps `toUpperCase` before `Collectors.joining("-")` recombines. Strings are immutable, so each call yields a new one.

## Run

    javac StringMethods.java && java StringMethods
