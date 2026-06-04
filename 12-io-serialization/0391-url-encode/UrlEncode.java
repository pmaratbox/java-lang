import java.nio.charset.StandardCharsets;

public class UrlEncode {
    public static void main(String[] args) {
        String input = "a b&c";
        StringBuilder out = new StringBuilder();
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            char c = (char) (b & 0xff);
            boolean unreserved = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                    || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.' || c == '~';
            if (unreserved) {
                out.append(c);
            } else {
                out.append('%').append(String.format("%02X", b & 0xff));
            }
        }
        System.out.println(out.toString());
    }
}
