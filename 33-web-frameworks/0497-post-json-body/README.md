# 0497 — POST JSON body

Parse a JSON request body with the real Javalin web framework. The app registers `POST /sum`, reads the JSON body via `ctx.bodyAsClass(Map.class)` (backed by Jackson), adds fields `a` and `b`, and returns the sum. Javalin starts on ephemeral port `0` so no fixed port is bound, and the route is exercised in-process with `java.net.http.HttpClient` posting `{"a":2,"b":3}`. The printed value is the real HTTP response body. slf4j-simple logging is set to `off` so only `5` prints.

## Run

    jbang PostJsonBody.java
