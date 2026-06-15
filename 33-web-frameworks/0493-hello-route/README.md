# 0493 — Hello route

Define a GET route with the real Javalin web framework. The app registers `GET /` returning the text `hello`, then starts on ephemeral port `0` so no fixed port is bound. The route is exercised in-process with `java.net.http.HttpClient` against the framework's actual listening port, and the printed value is the real HTTP response body. slf4j-simple logging is set to `off` so only `hello` prints.

## Run

    jbang HelloRoute.java
