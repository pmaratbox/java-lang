//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

public class CustomStatus {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin startup/request logging so only the status prints.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        .post("/create", ctx -> ctx.status(201).result("created")) // custom status code
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient c = HttpClient.newHttpClient();
    HttpResponse<String> resp = c.send(
        HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + port + "/create"))
            .POST(HttpRequest.BodyPublishers.noBody())
            .build(),
        HttpResponse.BodyHandlers.ofString());

    System.out.println(resp.statusCode()); // real status from the HTTP response
    app.stop();
  }
}
