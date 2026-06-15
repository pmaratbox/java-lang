# 0500 — Request header

Read a request header with the real Javalin web framework. This lesson starts a Javalin app on an ephemeral port (`start(0)`) and registers `GET /whoami`, whose handler echoes the `X-Name` request header via `ctx.header("X-Name")`. It then drives the route in-process using `java.net.http.HttpClient`, sending a request with the header `X-Name: alice`, and prints the actual HTTP response body. Framework logging is silenced (slf4j-simple level `off`, banner disabled) so only `alice` is printed.

## Run

    jbang RequestHeader.java
