//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

public class MethodRouting {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple so framework startup/request logs do not leak into stdout.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    // Same path /item, routed by HTTP method: GET -> "get", POST -> "post".
    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        .get("/item", ctx -> ctx.result("get"))
        .post("/item", ctx -> ctx.result("post"))
        .start(0);

    int port = app.port();
    HttpClient c = HttpClient.newHttpClient();
    // Send a real POST request in-process; Javalin dispatches it to the POST handler.
    String body = c.send(
        HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + port + "/item"))
            .POST(HttpRequest.BodyPublishers.noBody())
            .build(),
        HttpResponse.BodyHandlers.ofString()).body();
    System.out.println(body);
    app.stop();
  }
}
