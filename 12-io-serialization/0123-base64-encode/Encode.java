import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encode {
    public static void main(String[] args) {
        byte[] bytes = "hi".getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encoded);
    }
}
