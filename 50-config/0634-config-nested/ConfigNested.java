//JAVA 26
// Java — typesafe-config (HOCON/JSON) via jbang. Run: jbang ConfigNested.java
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
void main() {
  var cfg = ConfigFactory.parseFile(new File("app.json"));
  IO.println(cfg.getInt("server.port"));
}
