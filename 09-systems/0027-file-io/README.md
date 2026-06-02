# 0027 — File I/O

Write `hello, file` to a file, read it back, delete the file, and print `read: hello, file`. `java.nio.file.Files` offers static one-call helpers — `writeString` and `readString` (UTF-8 by default, since Java 11) and `delete` — that open and close the file internally and throw `IOException` on failure. `Path.of` builds the path.

## Run

    javac FileIO.java && java FileIO
