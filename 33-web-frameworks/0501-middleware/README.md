# 0501 — Middleware

Apply response-transforming middleware with the real Javalin web framework. The `GET /` handler returns `hello`, and an `after(...)` middleware hook runs once the handler finishes and rewrites the response body, prefixing it with `[mw] `. The route is exercised in-process by starting Javalin on ephemeral port `0` and sending a real HTTP request with `java.net.http.HttpClient`; the printed value is the actual response body (`[mw] hello`), with the prefix added by the middleware rather than the handler. slf4j-simple logging is turned off so only the response body prints.

## Run

    jbang Middleware.java
