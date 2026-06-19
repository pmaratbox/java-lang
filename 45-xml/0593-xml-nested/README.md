# 0593 — Nested element

Parses a fixed catalog document with Java's built-in DOM parser
(`javax.xml.parsers.DocumentBuilder` + `org.w3c.dom`, JDK stdlib) and reads the
text of the nested `<price>` element inside the first `<book>` via
`getElementsByTagName("price").item(0).getTextContent()`.

## Run

    jbang XmlNested.java
