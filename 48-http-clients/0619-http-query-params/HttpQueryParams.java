//JAVA 26
// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpQueryParams.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;
static void send(HttpExchange e, int code, String body) throws IOException {
  var b = body.getBytes(StandardCharsets.UTF_8);
  e.sendResponseHeaders(code, b.length);
  e.getResponseBody().write(b);
  e.close();
}
void main() throws Exception {
  // In-process server: only the /greet route this lesson needs.
  var s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
  s.createContext("/greet", e -> {
    var q = e.getRequestURI().getQuery();          // e.g. name=Bob
    var name = q.replaceAll("^name=", "");
    send(e, 200, "hi " + name);
  });
  s.start();
  var base = "http://127.0.0.1:" + s.getAddress().getPort();  // never PRINT the port

  // Real HTTP client makes the request with a query parameter.
  var c = HttpClient.newHttpClient();
  var r = c.send(
      HttpRequest.newBuilder(URI.create(base + "/greet?name=Bob")).build(),
      HttpResponse.BodyHandlers.ofString());
  IO.println(r.body());   // hi Bob

  s.stop(0);
}
