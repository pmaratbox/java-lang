import java.security.MessageDigest;

public class IncrementalHash {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update("foo".getBytes("UTF-8"));
        md.update("bar".getBytes("UTF-8"));
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) sb.append(String.format("%02x", b));
        System.out.println(sb);
    }
}
