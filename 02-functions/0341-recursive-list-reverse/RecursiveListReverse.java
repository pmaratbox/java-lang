import java.util.ArrayList;
import java.util.List;

static List<Integer> reverse(List<Integer> xs) {
    if (xs.isEmpty()) return new ArrayList<>();
    var rest = reverse(xs.subList(1, xs.size()));
    rest.add(xs.get(0));
    return rest;
}

void main() {
    var r = reverse(List.of(1, 2, 3));
    var sb = new StringBuilder();
    for (var i = 0; i < r.size(); i++) {
        if (i > 0) sb.append(" ");
        sb.append(r.get(i));
    }
    IO.println(sb);
}
