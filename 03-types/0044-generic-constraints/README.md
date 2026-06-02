# 0044 — Generic Constraints

Write a generic `largest(a, b)` that requires an ordered type, then call it on integers (3 and 9) and on strings (apple and pear), printing `9` and `pear`. The bounded type parameter `<T extends Comparable<T>>` requires `T` to be self-comparable, so `compareTo` is available. Generics are erased at runtime, so `largest` shares one implementation.

## Run

    javac GenericConstraints.java && java GenericConstraints
