# 0596 — Count elements

Uses Java's stdlib DOM parser (`javax.xml.parsers.DocumentBuilder` + `org.w3c.dom`) to parse a fixed catalog document, then counts the `<book>` elements via `getElementsByTagName("book").getLength()`.

## Run

    jbang XmlCount.java
