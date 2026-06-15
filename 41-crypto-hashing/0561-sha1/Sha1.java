import java.security.MessageDigest;

public class Sha1 {
    public static void main(String[] args) throws Exception {
        byte[] digest = MessageDigest.getInstance("SHA-1")
                .digest("hello".getBytes("UTF-8"));
        StringBuilder hex = new StringBuilder();
        for (byte b : digest) hex.append(String.format("%02x", b));
        System.out.println(hex);
    }
}
