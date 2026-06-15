# 0499 — Custom status

Use the real Javalin web framework, exercised in-process on an ephemeral port (`start(0)`), to set a custom HTTP status code on a handler. The `POST /create` route calls `ctx.status(201)` so the framework responds with `201 Created`. A `java.net.http.HttpClient` POSTs to the route and the program prints the real `statusCode()` from that HTTP response (`201`). slf4j-simple logging and the Javalin banner are silenced so only the status code prints.

## Run

    jbang CustomStatus.java
