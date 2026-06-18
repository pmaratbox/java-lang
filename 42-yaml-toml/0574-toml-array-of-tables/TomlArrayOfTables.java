//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;
import java.util.*;

public class TomlArrayOfTables {
  public static void main(String[] args) {
    String doc = "[[servers]]\nname = \"alpha\"\n[[servers]]\nname = \"beta\"\n";
    TomlArray servers = Toml.parse(doc).getArray("servers");
    List<String> names = new ArrayList<>();
    for (int i = 0; i < servers.size(); i++) {
      names.add(((TomlTable) servers.get(i)).getString("name"));
    }
    System.out.println(String.join(",", names));
  }
}
