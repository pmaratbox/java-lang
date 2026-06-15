# 0502 — Multiple routes

Register two routes with the real Javalin web framework and exercise them in-process on an ephemeral port (`start(0)`). This lesson defines `GET /` returning `home` and `GET /about` returning `about`, then sends two requests with the JDK `java.net.http.HttpClient` (no fixed listening port) and prints each response body on its own line. Framework startup/request logging is silenced via slf4j-simple so only the bodies print.

## Run

    jbang MultipleRoutes.java
