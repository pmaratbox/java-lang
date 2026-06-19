# 0592 — Read an attribute

Parses a fixed catalog document with Java's built-in DOM parser
(`javax.xml.parsers.DocumentBuilder` + `org.w3c.dom`, JDK stdlib) and reads the
`id` attribute of the first `<book>` element via `getAttribute("id")`.

## Run

    jbang XmlAttribute.java
