//JAVA 26
//DEPS com.typesafe:config:1.4.3
import com.typesafe.config.*;
import java.io.File;

void main() {
  var cfg = ConfigFactory.parseFile(new File("app.json"));
  System.out.println(cfg.getBoolean("debug"));
}
