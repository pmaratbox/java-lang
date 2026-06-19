# 0623 — POST JSON, parse JSON

Uses Java's real HTTP client — `java.net.http.HttpClient` (JDK stdlib) — to POST JSON to an
in-process server built from `com.sun.net.httpserver.HttpServer`. The server binds to an
ephemeral loopback port (`127.0.0.1:0`, never printed) and exposes a single route `POST /double`
that reads the request body `{"x":5}`, extracts the number with a small regex (no JSON
dependency), and replies `{"doubled":10}`. The client sends the request, and the doubled value is
parsed out of the response body via `String.replaceAll` and printed — `10` comes from the live
client call, never hardcoded.

## Run

    jbang HttpPostJson.java
