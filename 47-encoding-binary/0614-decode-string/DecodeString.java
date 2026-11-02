//JAVA 26
// Java — jackson-dataformat-msgpack via jbang. Run: jbang DecodeString.java
//DEPS org.msgpack:jackson-dataformat-msgpack:0.9.8
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

static ObjectMapper M = new ObjectMapper(new MessagePackFactory());

static byte[] fromHex(String hex) {
  var b = new byte[hex.length() / 2];
  for (var i = 0; i < b.length; i++) {
    b[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
  }
  return b;
}

void main() throws Exception {
  var bytes = fromHex("a568656c6c6f");
  var value = M.readValue(bytes, String.class);
  IO.println(value); // hello
}
