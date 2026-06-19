# 0586 — Select all matching

Uses the real HTML library [jsoup](https://jsoup.org/) to parse a fixed document
and the CSS class selector `.item` to select **all** matching elements. Each
matched `Element`'s `text()` is extracted and the texts are joined with commas,
yielding `apple,banana,cherry`. The result is produced by the parser and selector,
never hardcoded.

## Run

    jbang HtmlSelectAll.java
