//JAVA 26
import java.security.MessageDigest;
void main() throws Exception {
   var d = MessageDigest.getInstance("MD5").digest("hello".getBytes("UTF-8"));
   var sb = new StringBuilder();
   for (var b : d) sb.append(String.format("%02x", b));
   IO.println(sb);
}
