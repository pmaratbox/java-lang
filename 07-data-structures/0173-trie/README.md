# 0173 — Trie

Insert "cat" and "car" into a trie, then search "car" (yes) and "can" (no), printing `yes no`. Each node carries a `Map<Character, Node>` of children plus an end-of-word flag, and `computeIfAbsent` makes insertion concise.

## Run

    javac Trie.java && java Trie
