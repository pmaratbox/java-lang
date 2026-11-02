//JAVA 26
//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.*;
import java.util.*;

void main() {
  var y = new Yaml();
  Map<String, Object> d = y.load("server:\n  host: localhost\n  port: 8080\n");
  @SuppressWarnings("unchecked")
  var server = (Map<String, Object>) d.get("server");
  System.out.println(server.get("host") + ":" + server.get("port"));
}
