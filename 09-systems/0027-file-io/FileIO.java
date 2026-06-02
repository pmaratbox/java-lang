import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("greeting.txt");
        Files.writeString(path, "hello, file");
        String content = Files.readString(path);
        Files.delete(path);
        System.out.println("read: " + content);
    }
}
