//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;

public class ConfigEnvOverride {
  public static void main(String[] a) {
    Config file = ConfigFactory.parseFile(new File("app.json"));
    // The JVM cannot set its own environment, so we use a system property.
    // It is merged with HIGHER priority than the file, overriding `name`.
    System.setProperty("name", "from-env");
    Config cfg = ConfigFactory.systemProperties().withFallback(file);
    System.out.println(cfg.getString("name"));
  }
}
