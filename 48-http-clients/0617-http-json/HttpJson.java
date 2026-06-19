// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpJson.java   (NO //DEPS)
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;
public class HttpJson {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }
  public static void main(String[] a) throws Exception {
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/user", e -> send(e, 200, "{\"name\":\"Alice\",\"age\":30}"));
    s.start();
    String base = "http://127.0.0.1:" + s.getAddress().getPort();   // never PRINT the port
    HttpClient c = HttpClient.newHttpClient();
    var r = c.send(HttpRequest.newBuilder(URI.create(base + "/user")).build(),
                   HttpResponse.BodyHandlers.ofString());
    String json = r.body();
    // Extract the "name" field with a small regex (no JSON dependency needed).
    String name = json.replaceAll(".*\"name\":\"([^\"]+)\".*", "$1");
    System.out.println(name);   // Alice
    s.stop(0);
  }
}
