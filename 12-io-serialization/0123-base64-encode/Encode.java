import java.nio.charset.StandardCharsets;
import java.util.Base64;

void main() {
    var bytes = "hi".getBytes(StandardCharsets.UTF_8);
    var encoded = Base64.getEncoder().encodeToString(bytes);
    IO.println(encoded);
}
