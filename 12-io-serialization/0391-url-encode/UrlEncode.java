import java.nio.charset.StandardCharsets;

void main() {
    var input = "a b&c";
    var out = new StringBuilder();
    for (var b : input.getBytes(StandardCharsets.UTF_8)) {
        var c = (char) (b & 0xff);
        var unreserved = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.' || c == '~';
        if (unreserved) {
            out.append(c);
        } else {
            out.append('%').append(String.format("%02X", b & 0xff));
        }
    }
    IO.println(out.toString());
}
