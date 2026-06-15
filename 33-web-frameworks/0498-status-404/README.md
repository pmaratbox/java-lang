# 0498 — 404 status

Use the real Javalin web framework, exercised in-process on an ephemeral port (`start(0)`), to observe how an unmatched route is handled. Only `/` is registered, so requesting `GET /missing` with `java.net.http.HttpClient` makes Javalin return its built-in 404 response. The program prints the real `statusCode()` from that HTTP response (`404`). slf4j-simple logging and the Javalin banner are silenced so only the status code prints.

## Run

    jbang Status404.java
