//JAVA 26
// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpJson.java   (NO //DEPS)
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
  s.createContext("/user", e -> send(e, 200, "{\"name\":\"Alice\",\"age\":30}"));
  s.start();
  var base = "http://127.0.0.1:" + s.getAddress().getPort();   // never PRINT the port
  var c = HttpClient.newHttpClient();
  var r = c.send(HttpRequest.newBuilder(URI.create(base + "/user")).build(),
                 HttpResponse.BodyHandlers.ofString());
  var json = r.body();
  // Extract the "name" field with a small regex (no JSON dependency needed).
  var name = json.replaceAll(".*\"name\":\"([^\"]+)\".*", "$1");
  System.out.println(name);   // Alice
  s.stop(0);
}
