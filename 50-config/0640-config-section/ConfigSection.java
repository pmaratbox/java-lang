// Java — typesafe-config (HOCON/JSON) via jbang. Run: jbang ConfigSection.java
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
public class ConfigSection {
  public static void main(String[] a) {
    Config cfg = ConfigFactory.parseFile(new File("app.json"));
    System.out.println(cfg.getString("server.host") + ":" + cfg.getInt("server.port"));
  }
}
