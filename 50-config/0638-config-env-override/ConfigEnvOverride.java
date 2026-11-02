//JAVA 26
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;

void main() {
  var file = ConfigFactory.parseFile(new File("app.json"));
  // The JVM cannot set its own environment, so we use a system property.
  // It is merged with HIGHER priority than the file, overriding `name`.
  System.setProperty("name", "from-env");
  var cfg = ConfigFactory.systemProperties().withFallback(file);
  IO.println(cfg.getString("name"));
}
