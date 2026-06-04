import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Bytes {
    public static void main(String[] args) {
        byte[] bytes = "Hi".getBytes(StandardCharsets.UTF_8);
        List<String> values = new ArrayList<>();
        for (byte b : bytes) {
            values.add(String.valueOf(b & 0xFF));
        }
        System.out.println(String.join(" ", values));
    }
}
