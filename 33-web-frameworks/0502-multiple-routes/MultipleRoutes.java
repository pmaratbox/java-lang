//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

public class MultipleRoutes {
  public static void main(String[] a) throws Exception {
    // Silence slf4j-simple + Javalin/Jetty startup logging so only the bodies print.
    System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

    Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
        .get("/", ctx -> ctx.result("home"))
        .get("/about", ctx -> ctx.result("about"))
        .start(0); // ephemeral port
    int port = app.port();

    HttpClient client = HttpClient.newHttpClient();

    String home = client.send(
        HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/")).build(),
        HttpResponse.BodyHandlers.ofString()).body();
    String about = client.send(
        HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/about")).build(),
        HttpResponse.BodyHandlers.ofString()).body();

    System.out.println(home);
    System.out.println(about);
    app.stop();
  }
}
