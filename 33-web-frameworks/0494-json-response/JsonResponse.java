//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
//DEPS com.fasterxml.jackson.core:jackson-databind:2.17.2
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;
import java.util.Map;

public class JsonResponse {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin startup/request logging so only the body prints.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        .get("/user", ctx -> ctx.json(Map.of("name", "alice")))
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient c = HttpClient.newHttpClient();
    String body = c.send(
        HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/user")).build(),
        HttpResponse.BodyHandlers.ofString()).body();
    System.out.println(body);

    app.stop();
  }
}
