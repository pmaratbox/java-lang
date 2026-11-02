import java.util.List;
import java.util.StringJoiner;

void main() {
    var nested = List.of(1, List.of(2, List.of(3, 4)), 5);
    var sj = new StringJoiner(" ");
    flatten(nested, sj);
    System.out.println(sj);
}

static void flatten(Object node, StringJoiner sj) {
    if (node instanceof List<?> list) {
        for (var child : list) {
            flatten(child, sj);
        }
    } else {
        sj.add(node.toString());
    }
}
