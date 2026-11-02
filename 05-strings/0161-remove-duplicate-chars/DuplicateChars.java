import java.util.LinkedHashSet;
import java.util.Set;

void main() {
    var s = "aabbcc";
    Set<Character> seen = new LinkedHashSet<>();
    var sb = new StringBuilder();
    for (var c : s.toCharArray()) {
        if (seen.add(c)) {
            sb.append(c);
        }
    }
    IO.println(sb);
}
