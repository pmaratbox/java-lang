# 0597 — Sum numeric children

Uses Java's stdlib DOM parser (`javax.xml.parsers.DocumentBuilder` + `org.w3c.dom`) to parse a fixed catalog document, then reads each `<book>`'s nested `<price>` text, parses it as an integer, and sums the values (30 + 45).

## Run

    jbang XmlSum.java
