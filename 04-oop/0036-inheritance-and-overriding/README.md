# 0036 — Inheritance & Overriding

Define a base `Animal` with a `speak` method, a `Dog` that overrides it, and call both, printing `animal: some sound` and `dog: Woof`. `class Dog extends Animal` and an `@Override` method replace the inherited one; instance methods are virtual by default, so the runtime type picks the implementation. `super.speak()` reaches the parent.

## Run

    javac Inheritance.java && java Inheritance
