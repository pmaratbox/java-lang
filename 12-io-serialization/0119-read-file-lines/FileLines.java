import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLines {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("lines.txt");
        Files.write(file, List.of("first", "second", "third"));
        List<String> lines = Files.readAllLines(file);
        long count = lines.stream().filter(s -> !s.isBlank()).count();
        Files.delete(file);
        System.out.println("lines: " + count);
    }
}
