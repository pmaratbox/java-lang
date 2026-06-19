# 0603 — Inline code

Renders a backtick-wrapped inline code span with the commonmark-java library. The Markdown `` `code` `` is parsed and rendered to HTML as a `<code>` element inside a paragraph; the renderer's trailing newline is stripped before printing.

## Run

    jbang MdInlineCode.java
