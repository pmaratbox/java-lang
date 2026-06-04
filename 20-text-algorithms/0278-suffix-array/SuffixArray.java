import java.util.Arrays;
import java.util.Comparator;

public class SuffixArray {
    public static void main(String[] args) {
        String s = "banana";
        Integer[] idx = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) idx[i] = i;
        Arrays.sort(idx, Comparator.comparing(s::substring));
        StringBuilder sb = new StringBuilder();
        for (int i : idx) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
