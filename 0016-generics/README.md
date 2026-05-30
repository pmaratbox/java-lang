# 0016 — Generics

Define a generic `first` function that returns the first element of a list, then call it on a list of integers and a list of strings to show one definition working at two types. Java declares the type parameter before the return type: `static <T> T first(List<T> items)`, and infers `T` from the argument at each call. Generics are implemented by *erasure* — `T` exists only at compile time for type checking and is gone at runtime — which is why the element types must be the boxed `Integer`/`String`, not primitives.

## Run

    javac Generics.java && java Generics
