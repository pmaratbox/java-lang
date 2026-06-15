import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
public class HmacSha256 { public static void main(String[] a) throws Exception {
    Mac mac = Mac.getInstance("HmacSHA256");
    mac.init(new SecretKeySpec("key".getBytes("UTF-8"), "HmacSHA256"));
    byte[] d = mac.doFinal("hello".getBytes("UTF-8"));
    StringBuilder sb = new StringBuilder();
    for (byte b : d) sb.append(String.format("%02x", b));
    System.out.println(sb);
}}
