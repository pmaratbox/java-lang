import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "aabbcc";
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (seen.add(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
