# 0059 — Group By

Group the words `one`, `two`, `three` by their length and print each length with its words, in ascending order of length: `3:[one,two] 5:[three]`. A `TreeMap` keeps keys sorted; `computeIfAbsent(len, k -> new ArrayList<>())` creates each bucket on demand, and `String.join` formats the words.

## Run

    javac GroupBy.java && java GroupBy
