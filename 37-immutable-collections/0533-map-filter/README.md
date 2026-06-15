# 0533 — Map & filter

Uses Vavr's persistent `io.vavr.collection.List`. Starting from the immutable
list `[1,2,3,4,5]`, `filter` keeps the even values and `map` multiplies each by
ten — both operations return brand-new immutable lists while the original stays
unchanged. The result is printed space-joined.

## Run

    jbang MapFilter.java
