void main() {
    String text = "ababab", pat = "ab";
    var lps = new int[pat.length()];
    for (int i = 1, len = 0; i < pat.length();) {
        if (pat.charAt(i) == pat.charAt(len)) lps[i++] = ++len;
        else if (len > 0) len = lps[len - 1];
        else lps[i++] = 0;
    }
    var sb = new StringBuilder();
    for (int i = 0, j = 0; i < text.length();) {
        if (text.charAt(i) == pat.charAt(j)) { i++; j++; }
        else if (j > 0) j = lps[j - 1];
        else i++;
        if (j == pat.length()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(i - j);
            j = lps[j - 1];
        }
    }
    System.out.println(sb.toString());
}
