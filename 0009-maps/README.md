# 0009 — Maps

Build a `Map<String, Integer>`, look up `"two"`, and print its value and the
map's size. `Map.of(...)` creates an immutable map (Java 9+); for a mutable one
use `new HashMap<>()`. `.get(key)` returns the value, or `null` if the key is
absent; `.size()` counts entries.

## Run

    javac Maps.java && java Maps
