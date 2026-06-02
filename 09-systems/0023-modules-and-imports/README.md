# 0023 — Modules & Imports

Define `square(n)` in a separate `mathutil` module and import it from the main program, printing `square(8) = 64` across the module boundary. Each public class lives in its own `.java` file, and classes in the same package see each other with no `import` (that keyword is only for *other* packages). Compiling `Modules.java` makes `javac` find and build `Mathutil.java` from the same directory automatically.

## Run

    javac Modules.java && java Modules
