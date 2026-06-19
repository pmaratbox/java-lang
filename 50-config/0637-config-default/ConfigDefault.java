//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
import java.util.*;

public class ConfigDefault {
  public static void main(String[] a) {
    Config file = ConfigFactory.parseFile(new File("app.json"));
    Config cfg = file.withFallback(ConfigFactory.parseMap(Map.of("missing", "fallback")));
    System.out.println(cfg.getString("missing"));
  }
}
