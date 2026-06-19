// Java — typesafe-config (HOCON/JSON) via jbang. Run: jbang ConfigList.java
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
public class ConfigList {
  public static void main(String[] a) {
    Config cfg = ConfigFactory.parseFile(new File("app.json"));
    // Read the array `hosts` and join its elements with commas.
    System.out.println(String.join(",", cfg.getStringList("hosts")));
  }
}
