# 0624 — PUT request

Uses Java's real HTTP client — `java.net.http.HttpClient` (the JDK's built-in client) — to call
an in-process server built with `com.sun.net.httpserver.HttpServer`, bound to the loopback address
`127.0.0.1:0` so the OS picks an ephemeral port (never printed, no external network). The server
handles `PUT /item` by returning the text `updated`. The client issues the request with
`HttpRequest.newBuilder(...).PUT(...)`, then prints `HttpResponse.body()` — taken from the live
response, never hardcoded.

## Run

    jbang HttpPut.java
