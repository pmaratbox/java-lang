import java.nio.charset.StandardCharsets;

void main() {
    var bytes = "Hi".getBytes(StandardCharsets.UTF_8);
    var out = new StringBuilder();
    for (var i = 0; i < bytes.length; i++) {
        if (i > 0) out.append(" ");
        out.append(String.format("%02x", bytes[i] & 0xff));
    }
    IO.println(out.toString());
}
