# 0589 — Extract table cells

Uses the real HTML-parsing library [jsoup](https://jsoup.org/) to parse the
fixed `TABLE` document. The CSS type selector `td` matches every table cell;
`Document.select("td")` returns them in document (row-major) order, and each
element's `.text()` is joined with commas to print
`r1c1,r1c2,r2c1,r2c2` — the values come from the parser, never hardcoded.

## Run

    jbang HtmlTable.java
