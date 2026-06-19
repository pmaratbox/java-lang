# 0600 — Bold

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark`, pulled in via jbang `//DEPS`) — to render the fixed input `**bold**`.
`Parser.parse` builds the document AST and `HtmlRenderer.render` emits the HTML; the
`**...**` emphasis marker becomes a `<strong>` element wrapped in a `<p>` paragraph.
The renderer appends a trailing newline, so it is stripped with `replaceAll("\n+$", "")`
before printing `<p><strong>bold</strong></p>` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdBold.java
