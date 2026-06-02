# 0080 — Deduplicate

Remove duplicates from `1, 2, 2, 3, 1`, keeping the first occurrence of each in order, and print `1 2 3`. `LinkedHashSet` drops duplicates while preserving insertion order, so constructing one from the list deduplicates it in place.

## Run

    javac Deduplicate.java && java Deduplicate
