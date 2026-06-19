// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpQueryParams.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;
public class HttpQueryParams {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }
  public static void main(String[] a) throws Exception {
    // In-process server: only the /greet route this lesson needs.
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/greet", e -> {
      String q = e.getRequestURI().getQuery();          // e.g. name=Bob
      String name = q.replaceAll("^name=", "");
      send(e, 200, "hi " + name);
    });
    s.start();
    String base = "http://127.0.0.1:" + s.getAddress().getPort();  // never PRINT the port

    // Real HTTP client makes the request with a query parameter.
    HttpClient c = HttpClient.newHttpClient();
    var r = c.send(
        HttpRequest.newBuilder(URI.create(base + "/greet?name=Bob")).build(),
        HttpResponse.BodyHandlers.ofString());
    System.out.println(r.body());   // hi Bob

    s.stop(0);
  }
}
