# 0172 — Ring Buffer

Push 1,2,3,4,5 into a fixed capacity-3 ring buffer (overwriting oldest) and print the final contents `3 4 5`. A `head` index plus modular arithmetic on a fixed `int[]` keeps insertion O(1) without shifting.

## Run

    javac Buffer.java && java Buffer
