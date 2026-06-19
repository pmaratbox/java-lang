# 0598 — Filter by attribute

Uses Java's real XML library — DOM (`javax.xml.parsers` + `org.w3c.dom`, part of
the JDK standard library) — to parse the fixed `DOC`. `getElementsByTagName("book")`
yields every book element in document order; each book's `lang` attribute is read
with `getAttribute("lang")` and only books where it equals `en` (just `b1`) are
kept. Their `<title>` text is collected and joined with commas, printing `Go` —
the values come from the parser, never hardcoded.

## Run

    jbang XmlFilter.java
