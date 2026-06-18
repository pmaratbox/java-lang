//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;

public class TomlScalars {
  public static void main(String[] args) {
    TomlParseResult r = Toml.parse("title = \"demo\"\nversion = 2\n");
    System.out.println(r.getString("title") + " " + r.getLong("version"));
  }
}
