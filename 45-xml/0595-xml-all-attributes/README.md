# 0595 — All attributes

Uses Java's stdlib DOM parser (`javax.xml.parsers.DocumentBuilder` + `org.w3c.dom`) to parse a fixed catalog document, then collects the `id` attribute of every `<book>` element in document order and joins them with commas.

## Run

    jbang XmlAllAttributes.java
