//JAVA 26
// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpPostJson.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;
static void send(HttpExchange e, int code, String body) throws IOException {
  var b = body.getBytes(StandardCharsets.UTF_8);
  e.sendResponseHeaders(code, b.length);
  e.getResponseBody().write(b);
  e.close();
}
void main() throws Exception {
  var s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
  s.createContext("/double", e -> {
    var req = new String(e.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
    var x = Integer.parseInt(req.replaceAll(".*\"x\":\\s*(\\d+).*", "$1"));
    send(e, 200, "{\"doubled\":" + (2 * x) + "}");
  });
  s.start();
  var base = "http://127.0.0.1:" + s.getAddress().getPort();   // never PRINT the port
  var c = HttpClient.newHttpClient();
  var r = c.send(
      HttpRequest.newBuilder(URI.create(base + "/double"))
          .header("Content-Type", "application/json")
          .POST(HttpRequest.BodyPublishers.ofString("{\"x\":5}"))
          .build(),
      HttpResponse.BodyHandlers.ofString());
  var doubled = r.body().replaceAll(".*\"doubled\":\\s*(\\d+).*", "$1");
  IO.println(doubled);   // 10
  s.stop(0);
}
