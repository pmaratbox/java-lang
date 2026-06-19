# 0584 — Select by id

Uses the real HTML library [jsoup](https://jsoup.org) to parse a fixed HTML
document with `Jsoup.parse` and query it with the CSS id selector `#status`.
`selectFirst("#status")` returns the `<span id="status">` element, and `.text()`
extracts its text content — printed exactly, never hardcoded.

## Run

    jbang HtmlSelectId.java
