//JAVA 26
//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.Yaml;
import java.util.Map;

void main() {
  var yaml = new Yaml();
  Map<String, Object> doc = yaml.load("name: Alice\nrole: admin\nage: 30\n");
  IO.println(doc.get("name") + " " + doc.get("role") + " " + doc.get("age"));
}
