import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    static String join(List<Integer> xs) {
        return xs.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        List<Integer> asc = new ArrayList<>(List.of(3, 1, 2));
        Collections.sort(asc);
        List<Integer> desc = new ArrayList<>(List.of(3, 1, 2));
        desc.sort(Comparator.reverseOrder());
        System.out.println("asc: " + join(asc));
        System.out.println("desc: " + join(desc));
    }
}
