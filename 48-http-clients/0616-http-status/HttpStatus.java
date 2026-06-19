// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang HttpStatus.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*;
import java.net.http.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class HttpStatus {
  static void send(HttpExchange e, int code, String body) throws IOException {
    byte[] b = body.getBytes(StandardCharsets.UTF_8);
    e.sendResponseHeaders(code, b.length);
    e.getResponseBody().write(b);
    e.close();
  }

  public static void main(String[] a) throws Exception {
    HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    s.createContext("/hello", e -> send(e, 200, "hello world"));
    s.start();

    String base = "http://127.0.0.1:" + s.getAddress().getPort(); // never PRINT the port
    HttpClient c = HttpClient.newHttpClient();
    var r = c.send(HttpRequest.newBuilder(URI.create(base + "/hello")).build(),
                   HttpResponse.BodyHandlers.ofString());
    System.out.println(r.statusCode()); // 200

    s.stop(0);
  }
}
