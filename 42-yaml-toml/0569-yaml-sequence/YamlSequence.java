//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.*;
import java.util.*;
import java.util.stream.*;

public class YamlSequence {
  public static void main(String[] args) {
    Yaml y = new Yaml();
    Map<String, Object> d = y.load("fruits:\n  - apple\n  - banana\n  - cherry\n");
    @SuppressWarnings("unchecked")
    List<Object> fruits = (List<Object>) d.get("fruits");
    String out = fruits.stream().map(Object::toString).collect(Collectors.joining(","));
    System.out.println(out);
  }
}
