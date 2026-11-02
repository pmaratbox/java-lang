//JAVA 26
//DEPS org.yaml:snakeyaml:2.3
import org.yaml.snakeyaml.*;
import java.util.*;
import java.util.stream.*;

void main() {
  var y = new Yaml();
  Map<String, Object> d = y.load("fruits:\n  - apple\n  - banana\n  - cherry\n");
  @SuppressWarnings("unchecked")
  var fruits = (List<Object>) d.get("fruits");
  var out = fruits.stream().map(Object::toString).collect(Collectors.joining(","));
  IO.println(out);
}
