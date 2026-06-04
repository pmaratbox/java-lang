# 0164 — Merge Maps

Merge {a:1,b:2} and {b:3,c:4} with the right map winning on conflicts, printing `a:1 b:3 c:4`. A `TreeMap` keeps keys sorted while `put` from the right map overwrites conflicts.

## Run

    javac Merge.java && java Merge
