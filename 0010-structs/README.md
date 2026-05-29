# 0010 — Structs

Define a `Person` type with a `name` and an `age`, create one ("Ada", 36), and
print each field. A `record` (Java 16+) is a concise immutable data carrier: it
auto-generates the constructor, accessors, `equals`, `hashCode`, and
`toString`. Fields are read with accessor methods named after them — `p.name()`,
`p.age()`.

## Run

    javac Structs.java && java Structs
