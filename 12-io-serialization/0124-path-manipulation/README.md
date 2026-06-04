# 0124 — Path Manipulation

Join "/tmp" and "file.txt", then take the basename and extension, printing `/tmp/file.txt file.txt .txt`. Java's `Path.resolve` joins segments while `getFileName` yields the basename.

## Run

    javac Manipulation.java && java Manipulation
