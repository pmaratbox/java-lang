import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

void main() throws IOException {
    var file = Path.of("lines.txt");
    Files.write(file, List.of("first", "second", "third"));
    var lines = Files.readAllLines(file);
    var count = lines.stream().filter(s -> !s.isBlank()).count();
    Files.delete(file);
    IO.println("lines: " + count);
}
