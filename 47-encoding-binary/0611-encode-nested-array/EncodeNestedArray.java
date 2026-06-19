//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import java.util.List;

public class EncodeNestedArray {
  static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

  static String hex(Object v) throws Exception {
    byte[] b = M.writeValueAsBytes(v);
    StringBuilder s = new StringBuilder();
    for (byte x : b) s.append(String.format("%02x", x));
    return s.toString();
  }

  public static void main(String[] a) throws Exception {
    Object nested = List.of(List.of(1, 2), List.of(3, 4));
    System.out.println(hex(nested)); // 92920102920304
  }
}
