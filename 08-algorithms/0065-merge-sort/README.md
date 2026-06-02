# 0065 — Merge Sort

Sort the list `3, 1, 4, 1, 5, 2` using merge sort (recursively split in half, then merge the sorted halves) and print the result: `1 1 2 3 4 5`. `mergeSort` recurses on `subList` views and `merge` builds a new `ArrayList`, taking the smaller head of each half (`<=` is stable).

## Run

    javac MergeSort.java && java MergeSort
