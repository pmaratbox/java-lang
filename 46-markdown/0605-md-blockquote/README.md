# 0605 — Blockquote

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark`, pulled in via jbang `//DEPS`) — to render the fixed input `> quote`.
`Parser.parse` builds the document AST and `HtmlRenderer.render` emits the HTML; the
`>` marker becomes a `<blockquote>` element containing a `<p>` paragraph.
The renderer appends a trailing newline, so it is stripped with `replaceAll("\n+$", "")`
before printing `<blockquote>\n<p>quote</p>\n</blockquote>` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdBlockquote.java
