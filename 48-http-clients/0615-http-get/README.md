# 0615 — GET request

Uses the JDK's `java.net.http.HttpClient` to make a GET request against a tiny in-process server built with `com.sun.net.httpserver.HttpServer`. The server binds to an ephemeral loopback port (`127.0.0.1:0`), exposes only `GET /hello` returning the fixed body `hello world`, and the client fetches that route and prints the response body. No external network and the port is never printed.

## Run

    jbang HttpGet.java
