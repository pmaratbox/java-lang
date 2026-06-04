import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRoundtrip {
    public static void main(String[] args) throws IOException {
        Path file = Files.createTempFile("roundtrip", ".txt");
        String data = "ok-data";
        Files.writeString(file, data);
        String read = Files.readString(file, StandardCharsets.UTF_8);
        Files.delete(file);
        System.out.println("roundtrip: " + (read.equals(data) ? "ok" : "fail"));
    }
}
