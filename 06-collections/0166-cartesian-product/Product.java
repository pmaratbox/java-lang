import java.util.List;
import java.util.ArrayList;

void main() {
    var xs = List.of(1, 2);
    var ys = List.of("a", "b");
    List<String> pairs = new ArrayList<>();
    for (int x : xs) {
        for (var y : ys) {
            pairs.add(x + y);
        }
    }
    System.out.println(String.join(" ", pairs));
}
