//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

public class HelloRoute {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin/Jetty startup logging so only the body prints.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        .get("/", ctx -> ctx.result("hello"))
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient client = HttpClient.newHttpClient();
    HttpResponse<String> response = client.send(
        HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/")).build(),
        HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());
    app.stop();
  }
}
