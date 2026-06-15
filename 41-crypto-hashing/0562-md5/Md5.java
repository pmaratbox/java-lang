import java.security.MessageDigest;
public class Md5 { public static void main(String[] a) throws Exception {
    byte[] d = MessageDigest.getInstance("MD5").digest("hello".getBytes("UTF-8"));
    StringBuilder sb = new StringBuilder();
    for (byte b : d) sb.append(String.format("%02x", b));
    System.out.println(sb);
}}
