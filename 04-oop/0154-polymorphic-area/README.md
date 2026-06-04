# 0154 — Polymorphic Area

Sum the areas of a Rectangle(2,3)=6 and a Triangle(base=4,height=4)=8 through a common Shape interface, printing `total area: 14`. A `List<Shape>` dispatches `area()` to each concrete class at runtime, so the loop sums both polymorphically.

## Run

    javac Area.java && java Area
