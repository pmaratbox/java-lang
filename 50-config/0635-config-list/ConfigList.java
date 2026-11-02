//JAVA 26
// Java — typesafe-config (HOCON/JSON) via jbang. Run: jbang ConfigList.java
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
void main() {
  var cfg = ConfigFactory.parseFile(new File("app.json"));
  // Read the array `hosts` and join its elements with commas.
  IO.println(String.join(",", cfg.getStringList("hosts")));
}
