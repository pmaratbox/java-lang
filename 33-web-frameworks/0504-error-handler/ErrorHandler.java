//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

public class ErrorHandler {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin startup/request logging so only the status prints.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        // The handler throws a real exception when /boom is requested.
        .get("/boom", ctx -> { throw new RuntimeException("boom"); })
        // Framework error handling: turn any uncaught exception into a 500 response.
        .exception(Exception.class, (e, ctx) -> ctx.status(500))
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient c = HttpClient.newHttpClient();
    HttpResponse<String> resp = c.send(
        HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + port + "/boom"))
            .build(),
        HttpResponse.BodyHandlers.ofString());

    System.out.println(resp.statusCode());
    app.stop();
  }
}
