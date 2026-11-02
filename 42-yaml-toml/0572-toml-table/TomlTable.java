//JAVA 26
//DEPS org.tomlj:tomlj:1.1.1
import org.tomlj.*;

void main() {
  var r = Toml.parse("[server]\nhost = \"localhost\"\nport = 8080\n");
  var host = r.getString("server.host");
  long port = r.getLong("server.port");
  System.out.println("host=" + host + " port=" + port);
}
