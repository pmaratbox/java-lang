# 0583 — Select the &lt;h1&gt; tag

Uses the real HTML-parsing library [jsoup](https://jsoup.org/) to parse the
fixed `DOC`. The CSS type selector `h1` matches the heading element;
`Document.selectFirst("h1")` returns it and `.text()` extracts its text, printing
`Hello` — the value comes from the parser, never hardcoded.

## Run

    jbang HtmlSelectTag.java
