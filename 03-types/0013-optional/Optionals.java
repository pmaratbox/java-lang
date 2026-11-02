import java.util.Optional;

void main() {
    var present = Optional.of(42);
    Optional<Integer> absent = Optional.empty();

    IO.println("present: " + present.orElse(-1));
    IO.println("absent: " + absent.orElse(-1));
}
