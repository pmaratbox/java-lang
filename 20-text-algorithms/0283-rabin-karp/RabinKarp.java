public class RabinKarp {
    public static void main(String[] args) {
        String text = "xabxab", pat = "ab";
        int m = pat.length(), n = text.length();
        long base = 256, mod = 1_000_000_007L;
        long ph = 0, th = 0, pow = 1;
        for (int i = 0; i < m; i++) {
            ph = (ph * base + pat.charAt(i)) % mod;
            th = (th * base + text.charAt(i)) % mod;
            if (i > 0) pow = pow * base % mod;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i + m <= n; i++) {
            if (i > 0) {
                th = ((th - text.charAt(i - 1) * pow % mod + mod) % mod * base
                        + text.charAt(i + m - 1)) % mod;
            }
            if (th == ph && text.regionMatches(i, pat, 0, m)) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}
