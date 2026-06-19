# 0606 — Ordered list

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark`) — to render the fixed Markdown `1. a\n2. b`. `Parser.parse` builds
the document node, `HtmlRenderer.render` produces the `<ol>`/`<li>` HTML for the ordered
list, and the trailing newline appended by the renderer is stripped with
`replaceAll("\n+$", "")` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdOrderedList.java
