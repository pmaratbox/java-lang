# 0327 — FlatMap

FlatMap [1,2,3] with x -> [x, x*10] and print the flattened result `1 10 2 20 3 30`. `Stream.flatMap` maps each element to a sub-stream and concatenates them.

## Run

    javac Flatmap.java && java Flatmap
