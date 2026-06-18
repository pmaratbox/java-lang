//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;

public class TomlTable {
  public static void main(String[] args) {
    TomlParseResult r = Toml.parse("[server]\nhost = \"localhost\"\nport = 8080\n");
    String host = r.getString("server.host");
    long port = r.getLong("server.port");
    System.out.println("host=" + host + " port=" + port);
  }
}
