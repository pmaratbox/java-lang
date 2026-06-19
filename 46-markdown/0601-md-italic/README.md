# 0601 — Italic

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark`) — to render the fixed input `*italic*` to HTML. `Parser`
builds the document tree and `HtmlRenderer` renders it, producing the emphasis
(`<em>`) element wrapped in a paragraph. The renderer appends a trailing
newline, so `replaceAll("\n+$", "")` strips it before printing
`<p><em>italic</em></p>` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdItalic.java
