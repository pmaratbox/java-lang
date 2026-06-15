# 0503 — Method routing

Route the same path by HTTP method with the real Javalin web framework. The path `/item` has two handlers registered, `get(...)` returning `get` and `post(...)` returning `post`, so the request method alone selects which one runs. The route is exercised in-process by starting Javalin on ephemeral port `0` and sending a real `POST` request with `java.net.http.HttpClient`; the printed value is the actual response body returned by the POST handler (`post`). slf4j-simple logging is turned off so only the response body prints.

## Run

    jbang MethodRouting.java
