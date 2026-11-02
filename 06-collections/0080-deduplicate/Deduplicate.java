import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;

void main() {
    var nums = List.of(1, 2, 2, 3, 1);
    var unique = new LinkedHashSet<>(nums);
    var out = new StringJoiner(" ");
    for (int x : unique) out.add(String.valueOf(x));
    IO.println(out);
}
