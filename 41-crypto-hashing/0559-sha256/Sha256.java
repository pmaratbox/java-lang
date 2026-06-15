import java.security.MessageDigest;

public class Sha256 {
    public static void main(String[] args) throws Exception {
        byte[] digest = MessageDigest.getInstance("SHA-256")
                .digest("hello".getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb);
    }
}
