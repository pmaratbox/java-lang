# 0618 — POST a body

Uses Java's real HTTP client — `java.net.http.HttpClient` (JDK stdlib) — to POST the text
`ping` to an in-process server built with `com.sun.net.httpserver.HttpServer`, bound to an
ephemeral loopback port (`127.0.0.1:0`, never printed). The server's `/echo` route returns
the request body verbatim, so the printed value comes back through the client call rather
than being hardcoded. The request body is supplied with `HttpRequest.BodyPublishers.ofString`.

## Run

    jbang HttpPost.java
