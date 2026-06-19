# 0616 — Response status code

Uses Java's real HTTP client — `java.net.http.HttpClient` (the JDK's built-in client) — to call
an in-process server built with `com.sun.net.httpserver.HttpServer`, bound to the loopback address
`127.0.0.1:0` so the OS picks an ephemeral port (never printed, no external network). The server
exposes a single route, `GET /hello`, returning status `200`. The client sends the request and reads
`HttpResponse.statusCode()`, printing the integer `200` — taken from the live response, never
hardcoded.

## Run

    jbang HttpStatus.java
