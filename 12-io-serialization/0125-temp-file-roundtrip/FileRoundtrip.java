import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

void main() throws IOException {
    var file = Files.createTempFile("roundtrip", ".txt");
    var data = "ok-data";
    Files.writeString(file, data);
    var read = Files.readString(file, StandardCharsets.UTF_8);
    Files.delete(file);
    System.out.println("roundtrip: " + (read.equals(data) ? "ok" : "fail"));
}
