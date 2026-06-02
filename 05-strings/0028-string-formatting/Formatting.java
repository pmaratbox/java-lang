import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "pi: %.2f%n", 3.14159);
        System.out.printf("id: %05d%n", 42);
    }
}
