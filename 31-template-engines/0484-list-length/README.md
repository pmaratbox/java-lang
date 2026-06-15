# 0484 — List length

Render the length of a list with the real FreeMarker template engine. This lesson parses the fixed template string `${items?size}` and processes it against the fixed data `items=[1,2,3]`, where FreeMarker's `?size` built-in returns the number of elements in the sequence. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang ListLength.java
