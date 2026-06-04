import java.nio.file.Path;

public class Manipulation {
    public static void main(String[] args) {
        Path joined = Path.of("/tmp").resolve("file.txt");
        String full = joined.toString().replace('\\', '/');
        String base = joined.getFileName().toString();
        String ext = base.substring(base.lastIndexOf('.'));
        System.out.println(full + " " + base + " " + ext);
    }
}
