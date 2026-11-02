void main() {
    String s = "ADOBECODEBANC", t = "ABC";
    var need = new int[128];
    for (var c : t.toCharArray()) need[c]++;
    int required = t.length(), bestLen = Integer.MAX_VALUE, bestStart = 0;
    for (int l = 0, r = 0; r < s.length(); r++) {
        if (need[s.charAt(r)]-- > 0) required--;
        while (required == 0) {
            if (r - l + 1 < bestLen) { bestLen = r - l + 1; bestStart = l; }
            if (++need[s.charAt(l++)] > 0) required++;
        }
    }
    IO.println(s.substring(bestStart, bestStart + bestLen));
}
