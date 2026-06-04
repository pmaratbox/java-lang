public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int start = 0, len = 0;
        for (int c = 0; c < s.length(); c++) {
            for (int[] lr : new int[][]{{c, c}, {c, c + 1}}) {
                int l = lr[0], r = lr[1];
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
                if (r - l - 1 > len) { len = r - l - 1; start = l + 1; }
            }
        }
        System.out.println(s.substring(start, start + len));
    }
}
