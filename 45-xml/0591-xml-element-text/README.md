# 0591 — Element text

Uses Java's real XML library — DOM (`javax.xml.parsers` + `org.w3c.dom`, part of
the JDK standard library) — to parse the fixed `DOC`. `getElementsByTagName("book")`
locates the book elements in document order; the first book's `<title>` child is
read with `getElementsByTagName("title").item(0).getTextContent()`, printing `Go`
— the value comes from the parser, never hardcoded.

## Run

    jbang XmlElementText.java
