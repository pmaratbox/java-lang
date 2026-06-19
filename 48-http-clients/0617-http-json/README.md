# 0617 — Parse JSON response

Uses Java's real HTTP client — [`java.net.http.HttpClient`](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpClient.html)
(the JDK's standard HTTP client) — to GET `/user` from a tiny in-process
`com.sun.net.httpserver.HttpServer` bound to `127.0.0.1:0` (an ephemeral loopback
port — no external network). The route returns the JSON body
`{"name":"Alice","age":30}`. The client reads the body with
`HttpResponse.BodyHandlers.ofString()`, and the `name` field is extracted with a
small regex (no JSON dependency), printing `Alice` — the value comes from the
client call, never hardcoded.

## Run

    jbang HttpJson.java
