# 0494 — JSON response

Serve a JSON body with the real Javalin web framework, exercised in-process. The handler for `GET /user` calls `ctx.json(Map.of("name", "alice"))`, which Javalin serializes (via its bundled Jackson) into a compact JSON body. The app starts on ephemeral port `0`, and a `java.net.http.HttpClient` issues the request against the framework's actual port; the printed value is the real HTTP response body `{"name":"alice"}`. slf4j-simple logging is turned off so only the body prints.

## Run

    jbang JsonResponse.java
