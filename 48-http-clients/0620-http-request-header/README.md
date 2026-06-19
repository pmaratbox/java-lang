# 0620 — Send a request header

Uses Java's real HTTP client — `java.net.http.HttpClient` (JDK stdlib) — to call an
in-process server built with `com.sun.net.httpserver.HttpServer`, bound to the loopback
address on an ephemeral port (`127.0.0.1:0`, never printed). The server exposes a single
route, `GET /token`, that echoes back the request's `X-Token` header in the response body.
The client attaches a custom header with `.header("X-Token", "secret")` and prints the
returned body, which is `secret` — produced by the round trip through the client, never
hardcoded.

## Run

    jbang HttpRequestHeader.java
