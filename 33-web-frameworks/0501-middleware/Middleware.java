//JAVA 26
//DEPS io.javalin:javalin:6.3.0
//DEPS org.slf4j:slf4j-simple:2.0.16
import io.javalin.Javalin;
import java.net.URI;
import java.net.http.*;

void main() throws Exception {
  // Silence slf4j-simple so framework startup/request logs do not leak into stdout.
  System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");

  var app = Javalin.create(cfg -> cfg.showJavalinBanner = false)
      .get("/", ctx -> ctx.result("hello"))
      // Middleware: runs after the handler and rewrites the response body,
      // prefixing it with "[mw] ". The prefix is added here, not in the handler.
      .after(ctx -> ctx.result("[mw] " + ctx.result()))
      .start(0);

  var port = app.port();
  var c = HttpClient.newHttpClient();
  var body = c.send(
      HttpRequest.newBuilder().uri(URI.create("http://localhost:" + port + "/")).build(),
      HttpResponse.BodyHandlers.ofString()).body();
  System.out.println(body);
  app.stop();
}
