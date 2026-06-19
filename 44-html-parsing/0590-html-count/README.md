# 0590 — Count matches

Uses the real HTML library [jsoup](https://jsoup.org/) to parse a fixed document
and the CSS class selector `.item` to select every matching element. Calling
`.size()` on the returned `Elements` counts how many were found, yielding `3`.
The count comes from the parser and selector, never hardcoded.

## Run

    jbang HtmlCount.java
