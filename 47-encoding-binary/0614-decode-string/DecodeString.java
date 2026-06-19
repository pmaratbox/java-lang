// Java — jackson-dataformat-msgpack via jbang. Run: jbang DecodeString.java
//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

public class DecodeString {
  static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

  static byte[] fromHex(String hex) {
    byte[] b = new byte[hex.length() / 2];
    for (int i = 0; i < b.length; i++) {
      b[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
    }
    return b;
  }

  public static void main(String[] a) throws Exception {
    byte[] bytes = fromHex("a568656c6c6f");
    String value = M.readValue(bytes, String.class);
    System.out.println(value); // hello
  }
}
