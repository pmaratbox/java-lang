import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

void main() {
    String[] words = {"eat", "tea", "tan", "ate", "nat"};
    Set<String> keys = new HashSet<>();
    for (var w : words) {
        var c = w.toCharArray();
        Arrays.sort(c);
        keys.add(new String(c));
    }
    System.out.println(keys.size());
}
