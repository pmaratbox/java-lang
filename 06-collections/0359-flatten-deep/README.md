# 0359 — Flatten Deeply

Flatten the arbitrarily nested structure [1,[2,[3,4]],5] into `1 2 3 4 5`. A recursive helper uses a `List<?>` pattern match to descend into sublists and emits scalars in order.

## Run

    javac FlattenDeep.java && java FlattenDeep
