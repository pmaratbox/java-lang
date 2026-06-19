# 0587 — Read an attribute

Uses the real HTML library [jsoup](https://jsoup.org/) to parse the fixed
document and select the `<a>` element with the CSS tag selector `a`. Calling
`attr("href")` on the matched element returns its attribute value, printing
`https://example.com` — the value comes from the parser, never hardcoded.

## Run

    jbang HtmlAttribute.java
