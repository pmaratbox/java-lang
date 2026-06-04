import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat"};
        Set<String> keys = new HashSet<>();
        for (String w : words) {
            char[] c = w.toCharArray();
            Arrays.sort(c);
            keys.add(new String(c));
        }
        System.out.println(keys.size());
    }
}
