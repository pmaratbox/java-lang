import java.util.List;
import java.util.TreeSet;
import java.util.StringJoiner;

static String join(TreeSet<Integer> set) {
    var j = new StringJoiner(" ");
    for (int x : set) j.add(String.valueOf(x));
    return j.toString();
}

void main() {
    var a = new TreeSet<>(List.of(1, 2, 3));
    var b = new TreeSet<>(List.of(2, 3, 4));

    var union = new TreeSet<>(a);
    union.addAll(b);

    var inter = new TreeSet<>(a);
    inter.retainAll(b);

    IO.println(join(union));
    IO.println(join(inter));
}
