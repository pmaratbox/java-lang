import java.util.Optional;

void main() {
    var present = Optional.of(42);
    Optional<Integer> absent = Optional.empty();

    System.out.println("present: " + present.orElse(-1));
    System.out.println("absent: " + absent.orElse(-1));
}
