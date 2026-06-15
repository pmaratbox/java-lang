# 0504 — Error handler

Use the real Javalin web framework, exercised in-process on an ephemeral port (`start(0)`), to observe framework error handling. The `GET /boom` handler throws a real `RuntimeException`, and a Javalin `exception(Exception.class, ...)` handler turns that uncaught exception into a `500` response. Requesting `/boom` with `java.net.http.HttpClient` prints the real `statusCode()` from the HTTP response (`500`). slf4j-simple logging and the Javalin banner are silenced so only the status code prints.

## Run

    jbang ErrorHandler.java
