# 0005 — Loops

Print 1..5 with the classic three-part `for` loop. Java also has an
"enhanced" form (`for (int x : array)`) for iterating arrays and any
`Iterable`. Stream-style iteration can use `IntStream.rangeClosed(1, 5).forEach(IO::println)` with the repository's JDK 26.

## Run

    javac Loops.java && java Loops
