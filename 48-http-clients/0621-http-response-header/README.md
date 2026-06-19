# 0621 — Read a response header

Uses Java's real HTTP client — `java.net.http.HttpClient` (the JDK's built-in client) —
to read a custom response header. A minimal in-process server built with
`com.sun.net.httpserver.HttpServer`, bound to the loopback address `127.0.0.1:0`
(an ephemeral port, never printed), exposes one route `GET /info` that sets the
header `X-Count: 7` on its response. The client sends the request and prints the
header value via `response.headers().firstValue("X-Count")`, which yields `7`. A
custom header (rather than `Content-Type`) is used so no charset munging affects the
value, and the result comes from the client call rather than being hardcoded.

## Run

    jbang HttpResponseHeader.java
