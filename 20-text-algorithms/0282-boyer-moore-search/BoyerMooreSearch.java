import java.util.HashMap;
import java.util.Map;

void main() {
    String text = "zzabc", pat = "abc";
    Map<Character, Integer> last = new HashMap<>();
    for (var i = 0; i < pat.length(); i++) last.put(pat.charAt(i), i);
    int n = text.length(), m = pat.length(), result = -1;
    for (var s = 0; s <= n - m;) {
        var j = m - 1;
        while (j >= 0 && pat.charAt(j) == text.charAt(s + j)) j--;
        if (j < 0) { result = s; break; }
        int bc = last.getOrDefault(text.charAt(s + j), -1);
        s += Math.max(1, j - bc);
    }
    System.out.println(result);
}
