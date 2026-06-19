// Java — java.net.http.HttpClient (client) + com.sun.net.httpserver (in-process server). All JDK stdlib.
// Run: jbang HttpGet.java   (NO //DEPS)
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;

public class HttpGet {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }

  public static void main(String[] a) throws Exception {
    // In-process server bound to an ephemeral loopback port; exposes only GET /hello.
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/hello", e -> send(e, 200, "hello world"));
    s.start();
    String base = "http://127.0.0.1:" + s.getAddress().getPort();  // never PRINT the port

    // Real HTTP client makes the GET request and reads the body.
    HttpClient c = HttpClient.newHttpClient();
    var resp = c.send(
        HttpRequest.newBuilder(URI.create(base + "/hello")).build(),
        HttpResponse.BodyHandlers.ofString());
    System.out.println(resp.body());

    s.stop(0);
  }
}
