//JAVA 26
//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.*;
import java.util.*;

void main() {
  // Build the map; TreeMap keeps keys sorted (age, city, name).
  Map<String, Object> m = new TreeMap<>();
  m.put("name", "Alice");
  m.put("age", 30);
  m.put("city", "Paris");

  // BLOCK flow style => no flow braces, no quotes on simple scalars.
  var opt = new DumperOptions();
  opt.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

  // SnakeYAML serializes the sorted map; dump() ends with a newline.
  System.out.print(new Yaml(opt).dump(m));
}
