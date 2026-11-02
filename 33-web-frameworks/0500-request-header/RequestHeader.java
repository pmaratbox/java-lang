//JAVA 26
//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

void main() throws Exception {
  // Silence slf4j-simple so only the intended output reaches stdout/stderr.
  System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

  // Real Javalin app: read the X-Name request header and echo it back.
  var app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
      .get("/whoami", ctx -> ctx.result(ctx.header("X-Name")))
      .start(0); // ephemeral port

  var port = app.port();
  var c = HttpClient.newHttpClient();
  var body = c.send(
      HttpRequest.newBuilder()
          .uri(URI.create("http://localhost:" + port + "/whoami"))
          .header("X-Name", "alice")
          .build(),
      HttpResponse.BodyHandlers.ofString()).body();

  IO.println(body);
  app.stop();
}
