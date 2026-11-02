import java.util.Locale;

void main() {
    IO.println(String.format(Locale.US, "pi: %.2f", 3.14159));
    IO.println("id: %05d".formatted(42));
}
