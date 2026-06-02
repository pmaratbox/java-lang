import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<Integer> present = Optional.of(42);
        Optional<Integer> absent = Optional.empty();

        System.out.println("present: " + present.orElse(-1));
        System.out.println("absent: " + absent.orElse(-1));
    }
}
