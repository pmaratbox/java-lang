import java.nio.charset.StandardCharsets;

public class HexDump {
    public static void main(String[] args) {
        byte[] bytes = "Hi".getBytes(StandardCharsets.UTF_8);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            if (i > 0) out.append(" ");
            out.append(String.format("%02x", bytes[i] & 0xff));
        }
        System.out.println(out.toString());
    }
}
