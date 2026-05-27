# 0005 — Loops

Print 1..5 with the classic three-part `for` loop. Java also has an
"enhanced" form (`for (int x : array)`) for iterating arrays and any
`Iterable`. Java 8+ also added stream-style iteration: `IntStream.rangeClosed(1, 5).forEach(System.out::println)`.

## Run

    javac Loops.java && java Loops
