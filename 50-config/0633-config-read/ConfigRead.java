//JAVA 26
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;
import java.util.*;

void main() {
  var file = ConfigFactory.parseFile(new File("app.json"));
  var cfg = file.withFallback(ConfigFactory.parseMap(Map.of("missing", "fallback")));
  IO.println(cfg.getString("name"));
}
