//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
//DEPS com.fasterxml.jackson.core:jackson-databind:2.17.2
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;
import java.util.Map;

public class PostJsonBody {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin/Jetty startup/request logging so only the body prints.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        // Parse the JSON request body into a Map, add the two numbers, return the sum.
        .post("/sum", ctx -> {
          @SuppressWarnings("unchecked")
          Map<String, Object> json = ctx.bodyAsClass(Map.class);
          int a2 = ((Number) json.get("a")).intValue();
          int b2 = ((Number) json.get("b")).intValue();
          ctx.result(String.valueOf(a2 + b2));
        })
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient client = HttpClient.newHttpClient();
    HttpResponse<String> response = client.send(
        HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + port + "/sum"))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString("{\"a\":2,\"b\":3}"))
            .build(),
        HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());
    app.stop();
  }
}
