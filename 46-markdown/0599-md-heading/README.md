# 0599 — Heading

Uses Java's real Markdown library — [commonmark-java](https://github.com/commonmark/commonmark-java)
(`org.commonmark`) — to render the fixed Markdown `# Hello`. `Parser.parse` builds
the document node, `HtmlRenderer.render` produces the HTML for the ATX heading, and
the trailing newline appended by the renderer is stripped with `replaceAll("\n+$", "")`,
printing `<h1>Hello</h1>` — the HTML comes from the library, never hardcoded.

## Run

    jbang MdHeading.java
