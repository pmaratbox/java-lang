//JAVA 26
//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;

void main() {
  var r = Toml.parse("title = \"demo\"\nversion = 2\n");
  IO.println(r.getString("title") + " " + r.getLong("version"));
}
