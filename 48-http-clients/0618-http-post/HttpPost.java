// Java — java.net.http.HttpClient (client) + com.sun.net.httpserver (in-process server). All JDK stdlib.
// Run: jbang HttpPost.java   (NO //DEPS)
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*; import java.io.*; import java.nio.charset.StandardCharsets;

public class HttpPost {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }

  public static void main(String[] a) throws Exception {
    // In-process server bound to an ephemeral loopback port; exposes only POST /echo,
    // which returns the request body verbatim.
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/echo", e ->
        send(e, 200, new String(e.getRequestBody().readAllBytes(), StandardCharsets.UTF_8)));
    s.start();
    String base = "http://127.0.0.1:" + s.getAddress().getPort();  // never PRINT the port

    // Real HTTP client POSTs a text body and reads the echoed reply.
    HttpClient c = HttpClient.newHttpClient();
    var resp = c.send(
        HttpRequest.newBuilder(URI.create(base + "/echo"))
            .POST(HttpRequest.BodyPublishers.ofString("ping"))
            .build(),
        HttpResponse.BodyHandlers.ofString());
    System.out.println(resp.body());

    s.stop(0);
  }
}
