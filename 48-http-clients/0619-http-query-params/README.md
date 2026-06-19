# 0619 — Query parameters

Uses Java's real HTTP client — [`java.net.http.HttpClient`](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpClient.html)
from the JDK standard library — to send a request carrying a query parameter. A tiny
in-process server, built with `com.sun.net.httpserver.HttpServer` bound to an ephemeral
loopback port (`127.0.0.1:0`, never printed), exposes only `GET /greet`, reads the `name`
query parameter via `getRequestURI().getQuery()`, and replies `hi <name>`. The client
requests `/greet?name=Bob`; the printed body `hi Bob` comes from the live client call,
never hardcoded. Both the client and the server ship with the JDK, so there are no
`//DEPS`.

## Run

    jbang HttpQueryParams.java
