//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;

public class ConfigBool {
  public static void main(String[] a) {
    Config cfg = ConfigFactory.parseFile(new File("app.json"));
    System.out.println(cfg.getBoolean("debug"));
  }
}
