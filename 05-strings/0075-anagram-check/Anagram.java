import java.util.Arrays;

static boolean anagram(String a, String b) {
    var x = a.toCharArray();
    var y = b.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    return Arrays.equals(x, y);
}

void main() {
    String[][] pairs = {{"listen", "silent"}, {"hello", "world"}};
    for (var p : pairs) {
        IO.println(p[0] + "/" + p[1] + ": " + (anagram(p[0], p[1]) ? "yes" : "no"));
    }
}
