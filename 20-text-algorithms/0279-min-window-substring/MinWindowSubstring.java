public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        int required = t.length(), bestLen = Integer.MAX_VALUE, bestStart = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            if (need[s.charAt(r)]-- > 0) required--;
            while (required == 0) {
                if (r - l + 1 < bestLen) { bestLen = r - l + 1; bestStart = l; }
                if (++need[s.charAt(l++)] > 0) required++;
            }
        }
        System.out.println(s.substring(bestStart, bestStart + bestLen));
    }
}
