# 0041 — Command-line Arguments

Read the first command-line argument and greet it, so running with `Ada` prints `hello, Ada`. `main(String[] args)` receives only the arguments — no program-name slot — so `args[0]` is the first one. The class name on the `java` command line is not part of `args`.

## Run

    javac CommandLineArgs.java && java CommandLineArgs Ada
