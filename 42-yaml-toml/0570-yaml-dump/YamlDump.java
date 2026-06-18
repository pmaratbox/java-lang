//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.*;
import java.util.*;

public class YamlDump {
  public static void main(String[] args) {
    // Build the map; TreeMap keeps keys sorted (age, city, name).
    Map<String, Object> m = new TreeMap<>();
    m.put("name", "Alice");
    m.put("age", 30);
    m.put("city", "Paris");

    // BLOCK flow style => no flow braces, no quotes on simple scalars.
    DumperOptions opt = new DumperOptions();
    opt.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

    // SnakeYAML serializes the sorted map; dump() ends with a newline.
    System.out.print(new Yaml(opt).dump(m));
  }
}
