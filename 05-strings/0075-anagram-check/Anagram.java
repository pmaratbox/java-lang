import java.util.Arrays;

public class Anagram {
    static boolean anagram(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        String[][] pairs = {{"listen", "silent"}, {"hello", "world"}};
        for (String[] p : pairs) {
            System.out.println(p[0] + "/" + p[1] + ": " + (anagram(p[0], p[1]) ? "yes" : "no"));
        }
    }
}
