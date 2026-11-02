//JAVA 26
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
void main() throws Exception {
   var mac = Mac.getInstance("HmacSHA256");
   mac.init(new SecretKeySpec("key".getBytes("UTF-8"), "HmacSHA256"));
   var d = mac.doFinal("hello".getBytes("UTF-8"));
   var sb = new StringBuilder();
   for (var b : d) sb.append(String.format("%02x", b));
   System.out.println(sb);
}
