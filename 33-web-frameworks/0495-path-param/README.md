# 0495 — Path parameter

Capture a path parameter with the real Javalin web framework. This lesson registers `GET /users/{id}` and reads the captured segment via `ctx.pathParam("id")`, echoing it back as the response body. The route is exercised in-process: Javalin binds an ephemeral port with `.start(0)`, then `java.net.http.HttpClient` issues a real `GET /users/42` against that port and the body is printed. slf4j-simple and the Javalin banner are silenced so only the response body reaches stdout.

## Run

    jbang PathParam.java
