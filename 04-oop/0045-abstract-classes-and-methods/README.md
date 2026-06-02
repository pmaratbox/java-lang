# 0045 — Abstract Classes & Methods

Define an abstract `Shape` with an abstract `area` and a concrete `describe` that uses it, then implement a `Square` of side 3 and print `area: 9`. An `abstract class` can mix `abstract` methods (which subclasses must implement) with concrete ones; `Shape` cannot be instantiated, and `describe` calls the subclass's `area` via dynamic dispatch.

## Run

    javac AbstractClasses.java && java AbstractClasses
