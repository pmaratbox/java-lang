//JAVA 26
// Java — jackson-dataformat-msgpack via jbang. Run: jbang EncodeNull.java
//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

static String hex(Object v) throws Exception {
  var b = M.writeValueAsBytes(v);
  var s = new StringBuilder();
  for (var x : b) s.append(String.format("%02x", x));
  return s.toString();
}

void main() throws Exception {
  IO.println(hex((Object) null));
}
