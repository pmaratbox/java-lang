# 0023 — Modules & Imports

Define `square(n)` in the separate `Mathutil` helper class and call it from the compact main program, printing `square(8) = 64`. Reusable helpers retain named classes so other files can reference them. Both files are in the unnamed package and need no import between them. Compiling `Modules.java` makes `javac` find and build `Mathutil.java` from the same directory automatically.

## Run

    javac Modules.java && java Modules
