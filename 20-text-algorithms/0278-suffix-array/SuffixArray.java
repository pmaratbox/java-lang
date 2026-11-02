import java.util.Arrays;
import java.util.Comparator;

void main() {
    var s = "banana";
    var idx = new Integer[s.length()];
    for (var i = 0; i < s.length(); i++) idx[i] = i;
    Arrays.sort(idx, Comparator.comparing(s::substring));
    var sb = new StringBuilder();
    for (int i : idx) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(i);
    }
    IO.println(sb.toString());
}
