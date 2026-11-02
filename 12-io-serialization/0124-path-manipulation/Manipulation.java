import java.nio.file.Path;

void main() {
    var joined = Path.of("/tmp").resolve("file.txt");
    var full = joined.toString().replace('\\', '/');
    var base = joined.getFileName().toString();
    var ext = base.substring(base.lastIndexOf('.'));
    IO.println(full + " " + base + " " + ext);
}
