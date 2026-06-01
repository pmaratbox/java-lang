# 0039 — Records & Value Equality

Create two points with the same fields, print one as `point: (1, 2)`, and compare them by value to print `equal: yes`. A `record` automatically generates `equals`, `hashCode`, and `toString` from its components, giving value equality. Note `==` still compares references, so `equals` is used to compare by value.

## Run

    javac Records.java && java Records
