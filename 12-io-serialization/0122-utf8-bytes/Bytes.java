import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

void main() {
    var bytes = "Hi".getBytes(StandardCharsets.UTF_8);
    List<String> values = new ArrayList<>();
    for (var b : bytes) {
        values.add(String.valueOf(b & 0xFF));
    }
    IO.println(String.join(" ", values));
}
