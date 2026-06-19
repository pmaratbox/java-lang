# 0594 — Find all elements

Uses Java's built-in DOM XML library (`javax.xml.parsers.DocumentBuilderFactory` + `org.w3c.dom`, JDK stdlib) to parse the fixed catalog document, find ALL `<book>` elements via `getElementsByTagName`, extract each book's `<title>` text, and join them with commas.

## Run

    jbang XmlFindAll.java
