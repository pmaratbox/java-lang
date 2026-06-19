// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpRequestHeader.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;

public class HttpRequestHeader {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }

  public static void main(String[] a) throws Exception {
    // In-process server: bind to an ephemeral loopback port. GET /token echoes the X-Token header.
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/token", e -> send(e, 200, e.getRequestHeaders().getFirst("X-Token")));
    s.start();

    String base = "http://127.0.0.1:" + s.getAddress().getPort();   // never PRINT the port

    // Real HTTP client: send X-Token: secret and print the echoed body.
    HttpClient c = HttpClient.newHttpClient();
    HttpResponse<String> r = c.send(
        HttpRequest.newBuilder(URI.create(base + "/token")).header("X-Token", "secret").build(),
        HttpResponse.BodyHandlers.ofString());
    System.out.println(r.body());   // secret

    s.stop(0);
  }
}
