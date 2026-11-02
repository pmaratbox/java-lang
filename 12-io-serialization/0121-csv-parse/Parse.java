import java.util.ArrayList;
import java.util.List;

void main() {
    String[] rows = {"alice,30", "bob,25"};
    List<String> pairs = new ArrayList<>();
    for (var row : rows) {
        var parts = row.split(",");
        pairs.add(parts[0] + "=" + parts[1]);
    }
    IO.println(String.join(" ", pairs));
}
