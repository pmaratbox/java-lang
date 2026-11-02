//JAVA 26
// Java — jackson-dataformat-msgpack via jbang. Run: jbang EncodeMap.java
//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import java.util.Map;

static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

static String hex(Object v) throws Exception {
  var b = M.writeValueAsBytes(v);
  var s = new StringBuilder();
  for (var x : b) s.append(String.format("%02x", x));
  return s.toString();
}

void main() throws Exception {
  System.out.println(hex(Map.of("a", 1))); // 81a16101 (fixmap + key a161 + value 01)
}
