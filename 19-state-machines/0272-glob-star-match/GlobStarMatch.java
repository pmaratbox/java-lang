public class GlobStarMatch {
    static boolean match(String pat, String text) {
        int p = 0, t = 0;
        int star = -1, mark = 0;
        while (t < text.length()) {
            if (p < pat.length() && (pat.charAt(p) == text.charAt(t))) {
                p++;
                t++;
            } else if (p < pat.length() && pat.charAt(p) == '*') {
                star = p;
                mark = t;
                p++;
            } else if (star != -1) {
                p = star + 1;
                mark++;
                t = mark;
            } else {
                return false;
            }
        }
        while (p < pat.length() && pat.charAt(p) == '*') p++;
        return p == pat.length();
    }

    public static void main(String[] args) {
        String a = match("a*b", "aaab") ? "yes" : "no";
        String b = match("a*b", "aac") ? "yes" : "no";
        System.out.println(a + " " + b);
    }
}
