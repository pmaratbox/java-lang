import java.util.Map;

void main() {
    var scores = Map.of("a", 1, "b", 2, "c", 3);
    var total = scores.values().stream().mapToInt(Integer::intValue).sum();
    System.out.println("sum: " + total);
}
