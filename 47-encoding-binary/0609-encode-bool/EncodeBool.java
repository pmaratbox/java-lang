//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

public class EncodeBool {
  static ObjectMapper M = new ObjectMapper(new MessagePackFactory());
  static String hex(Object v) throws Exception {
    byte[] b = M.writeValueAsBytes(v);
    StringBuilder s = new StringBuilder();
    for (byte x : b) s.append(String.format("%02x", x));
    return s.toString();
  }
  public static void main(String[] a) throws Exception {
    System.out.println(hex(true)); // c3
  }
}
