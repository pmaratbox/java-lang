//JAVA 26
//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;
import java.util.*;

void main() {
  var r = Toml.parse("tags = [\"red\", \"green\", \"blue\"]\n");
  var tags = r.getArray("tags");
  List<String> values = new ArrayList<>();
  for (var i = 0; i < tags.size(); i++) {
    values.add((String) tags.get(i));
  }
  IO.println(String.join(",", values));
}
