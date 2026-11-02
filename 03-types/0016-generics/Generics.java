import java.util.List;

static <T> T first(List<T> items) {
    return items.get(0);
}

void main() {
    var ints = List.of(1, 2, 3);
    var strs = List.of("a", "b", "c");

    IO.println("first int: " + first(ints));
    IO.println("first string: " + first(strs));
}
