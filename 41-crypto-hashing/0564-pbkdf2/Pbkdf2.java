import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Pbkdf2 {
    public static void main(String[] args) throws Exception {
        char[] password = "password".toCharArray();
        byte[] salt = "salt".getBytes("UTF-8");
        int iterations = 1000;
        int keyBits = 32 * 8;

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyBits);
        byte[] derived = factory.generateSecret(spec).getEncoded();

        StringBuilder sb = new StringBuilder();
        for (byte b : derived) sb.append(String.format("%02x", b));
        System.out.println(sb);
    }
}
