//JAVA 26
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

void main() throws Exception {
    var password = "password".toCharArray();
    var salt = "salt".getBytes("UTF-8");
    var iterations = 1000;
    var keyBits = 32 * 8;

    var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    var spec = new PBEKeySpec(password, salt, iterations, keyBits);
    var derived = factory.generateSecret(spec).getEncoded();

    var sb = new StringBuilder();
    for (var b : derived) sb.append(String.format("%02x", b));
    System.out.println(sb);
}
