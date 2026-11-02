import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

static String join(List<Integer> xs) {
    return xs.stream().map(String::valueOf).collect(Collectors.joining(" "));
}

void main() {
    List<Integer> asc = new ArrayList<>(List.of(3, 1, 2));
    Collections.sort(asc);
    List<Integer> desc = new ArrayList<>(List.of(3, 1, 2));
    desc.sort(Comparator.reverseOrder());
    IO.println("asc: " + join(asc));
    IO.println("desc: " + join(desc));
}
