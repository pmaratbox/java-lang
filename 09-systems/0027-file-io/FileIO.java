import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

void main() throws IOException {
    var path = Path.of("greeting.txt");
    Files.writeString(path, "hello, file");
    var content = Files.readString(path);
    Files.delete(path);
    System.out.println("read: " + content);
}
