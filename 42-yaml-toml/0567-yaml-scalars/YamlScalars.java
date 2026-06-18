//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.Yaml;
import java.util.Map;

public class YamlScalars {
  public static void main(String[] args) {
    Yaml yaml = new Yaml();
    Map<String, Object> doc = yaml.load("name: Alice\nrole: admin\nage: 30\n");
    System.out.println(doc.get("name") + " " + doc.get("role") + " " + doc.get("age"));
  }
}
