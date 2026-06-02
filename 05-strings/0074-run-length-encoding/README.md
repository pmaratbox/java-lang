# 0074 — Run-Length Encoding

Run-length encode the string `aaabbc` (each run of a repeated character becomes the character followed by its count), printing `a3b2c1`. `StringBuilder.append` adds the run character and its count; the inner loop counts consecutive equal characters.

## Run

    javac RunLength.java && java RunLength
