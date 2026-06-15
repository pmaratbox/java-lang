# 0496 — Query parameter

Read a query-string parameter with the real Javalin web framework. The app registers `GET /greet` and uses `ctx.queryParam("name")` to read the `name` query parameter, returning `hello ` + the value. The app starts on ephemeral port `0` so no fixed port is bound, and the route is exercised in-process with `java.net.http.HttpClient` requesting `/greet?name=alice`. The printed value is the real HTTP response body. slf4j-simple logging is set to `off` so only `hello alice` prints.

## Run

    jbang QueryParam.java
