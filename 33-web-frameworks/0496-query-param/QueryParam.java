//JAVA 26
//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

void main() throws Exception {
  // Silence slf4j-simple + Javalin/Jetty startup logging so only the body prints.
  System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

  var app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
      .get("/greet", ctx -> ctx.result("hello " + ctx.queryParam("name")))
      .start(0); // ephemeral port
  var port = app.port();

  var client = HttpClient.newHttpClient();
  var response = client.send(
      HttpRequest.newBuilder()
          .uri(URI.create("http://localhost:" + port + "/greet?name=alice"))
          .build(),
      HttpResponse.BodyHandlers.ofString());

  IO.println(response.body());
  app.stop();
}
