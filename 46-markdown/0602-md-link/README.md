# 0602 — Link

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark:commonmark`) — to render the fixed Markdown input `[text](http://x.com)`.
The inline link construct `[text](url)` is parsed by `Parser` and rendered to HTML by
`HtmlRenderer`, producing an `<a href="...">` anchor wrapped in a paragraph. The renderer
appends a trailing newline, so it is stripped with `replaceAll("\n+$", "")` before printing
`<p><a href="http://x.com">text</a></p>` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdLink.java
