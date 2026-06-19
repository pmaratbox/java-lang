# 0588 — Descendant selector

Uses the real HTML library [jsoup](https://jsoup.org/) to parse the fixed DOC and
query it with the descendant CSS selector `.content p`, which matches every `<p>`
nested anywhere inside the element with class `content`. `Document.select(".content p")`
returns the two paragraphs; each one's `.text()` is taken and joined with commas to
print `first,second` — the values come from the parser, never hardcoded.

## Run

    jbang HtmlNested.java
