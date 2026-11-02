//JAVA 26
// Java — java.net.http.HttpClient + com.sun.net.httpserver in-process server (bind 127.0.0.1:0). All JDK stdlib.
// Run: jbang Http404.java   (NO //DEPS).
import com.sun.net.httpserver.*;
import java.net.*; import java.net.http.*;

void main() throws Exception {
  var s = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
  // Server defines no routes, so any request resolves to a 404.
  s.start();
  var base = "http://127.0.0.1:" + s.getAddress().getPort();  // never PRINT the port
  var c = HttpClient.newHttpClient();
  var r = c.send(HttpRequest.newBuilder(URI.create(base + "/missing")).build(),
                 HttpResponse.BodyHandlers.ofString());
  System.out.println(r.statusCode());  // 404 — from the live response, not hardcoded
  s.stop(0);
}
