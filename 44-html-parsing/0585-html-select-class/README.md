# 0585 — Select by class

Uses the real HTML library [jsoup](https://jsoup.org/) to parse the fixed
document and query it with the CSS class selector `.item`. `Jsoup.parse(DOC)`
builds a `Document`, and `selectFirst(".item")` returns the FIRST element whose
class is `item` (the `<li>apple</li>`). Its `.text()` prints `apple` — the value
comes from the parser, never hardcoded.

## Run

    jbang HtmlSelectClass.java
