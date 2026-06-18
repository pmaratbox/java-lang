//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;
import java.util.*;

public class TomlArray {
  public static void main(String[] args) {
    TomlParseResult r = Toml.parse("tags = [\"red\", \"green\", \"blue\"]\n");
    org.tomlj.TomlArray tags = r.getArray("tags");
    List<String> values = new ArrayList<>();
    for (int i = 0; i < tags.size(); i++) {
      values.add((String) tags.get(i));
    }
    System.out.println(String.join(",", values));
  }
}
