void main() {
    var s = "aaaa";
    var n = s.length();
    var z = new int[n];
    for (int i = 1, l = 0, r = 0; i < n; i++) {
        if (i < r) z[i] = Math.min(r - i, z[i - l]);
        while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
        if (i + z[i] > r) { l = i; r = i + z[i]; }
    }
    var sb = new StringBuilder();
    for (var i = 1; i < n; i++) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(z[i]);
    }
    System.out.println(sb.toString());
}
