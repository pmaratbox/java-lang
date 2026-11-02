//JAVA 26
//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;
import java.util.*;

void main() {
  var doc = "[[servers]]\nname = \"alpha\"\n[[servers]]\nname = \"beta\"\n";
  var servers = Toml.parse(doc).getArray("servers");
  List<String> names = new ArrayList<>();
  for (var i = 0; i < servers.size(); i++) {
    names.add(((TomlTable) servers.get(i)).getString("name"));
  }
  IO.println(String.join(",", names));
}
