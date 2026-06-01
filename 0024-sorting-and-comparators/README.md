# 0024 — Sorting & Comparators

Sort `[3, 1, 2]` ascending, then again with a custom comparator that reverses the order, printing `asc: 1 2 3` and `desc: 3 2 1`. `Collections.sort` orders a `List` by natural ordering; `List.sort` takes a `Comparator`, and `Comparator.reverseOrder()` gives the descending one. Primitive arrays use `Arrays.sort`, which has no comparator overload, so a `List<Integer>` is used here.

## Run

    javac Sorting.java && java Sorting
