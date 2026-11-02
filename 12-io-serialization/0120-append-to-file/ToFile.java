import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

void main() throws IOException {
    var file = Path.of("data.txt");
    Files.write(file, List.of("a"));
    Files.write(file, List.of("b"), StandardOpenOption.APPEND);
    var lines = Files.readAllLines(file);
    Files.delete(file);
    System.out.println(String.join(" ", lines));
}
