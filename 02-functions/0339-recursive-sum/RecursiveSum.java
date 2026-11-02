import java.util.List;

static int sum(List<Integer> xs) {
    if (xs.isEmpty()) return 0;
    return xs.get(0) + sum(xs.subList(1, xs.size()));
}

void main() {
    IO.println(sum(List.of(1, 2, 3, 4)));
}
