import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ToFile {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("data.txt");
        Files.write(file, List.of("a"));
        Files.write(file, List.of("b"), StandardOpenOption.APPEND);
        List<String> lines = Files.readAllLines(file);
        Files.delete(file);
        System.out.println(String.join(" ", lines));
    }
}
