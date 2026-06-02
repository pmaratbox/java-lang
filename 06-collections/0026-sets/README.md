# 0026 — Sets

Build a set from `1, 2, 2, 3` so the duplicate collapses, then print its `size: 3` and whether it contains `2` (`has 2: yes`) and `5` (`has 5: no`). `HashSet<Integer>` stores unique elements with O(1) average operations; constructing it from a `List` drops the duplicate. `.size()` counts and `.contains` tests membership. `LinkedHashSet` preserves insertion order and `TreeSet` keeps them sorted.

## Run

    javac Sets.java && java Sets
