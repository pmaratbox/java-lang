# 0015 — Interfaces

Define a `Shape` interface with `name()` and `area()` methods, implement it for a rectangle and a square, then loop over a collection of shapes and print each one's area. Java's `interface` is the textbook contract, and here each shape is a `record` that both stores its fields and `implements Shape` — the record's generated `width()`/`height()` accessors feed the `area()` calculation. A `List<Shape>` holds either type, and iterating it calls `s.area()` through the interface, dispatching to the actual record at runtime.

## Run

    javac Interfaces.java && java Interfaces
