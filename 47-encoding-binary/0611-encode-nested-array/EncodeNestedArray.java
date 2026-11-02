//JAVA 26
//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import java.util.List;

static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

static String hex(Object v) throws Exception {
  var b = M.writeValueAsBytes(v);
  var s = new StringBuilder();
  for (var x : b) s.append(String.format("%02x", x));
  return s.toString();
}

void main() throws Exception {
  Object nested = List.of(List.of(1, 2), List.of(3, 4));
  IO.println(hex(nested)); // 92920102920304
}
