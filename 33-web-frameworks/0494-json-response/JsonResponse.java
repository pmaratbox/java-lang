//JAVA 26
//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
//DEPS com.fasterxml.jackson.core:jackson-databind:2.17.2
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;
import java.util.Map;

void main() throws Exception {
  // Silence slf4j-simple + Javalin startup/request logging so only the body prints.
  System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

  var app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
      .get("/user", ctx -> ctx.json(Map.of("name", "alice")))
      .start(0); // ephemeral port
  var port = app.port();

  var c = HttpClient.newHttpClient();
  var body = c.send(
      HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/user")).build(),
      HttpResponse.BodyHandlers.ofString()).body();
  IO.println(body);

  app.stop();
}
