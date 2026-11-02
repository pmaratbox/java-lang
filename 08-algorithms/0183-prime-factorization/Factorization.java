void main() {
    var n = 60;
    var sb = new StringBuilder();
    while (n % 2 == 0) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(2);
        n /= 2;
    }
    for (var f = 3; (long) f * f <= n; f += 2) {
        while (n % f == 0) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(f);
            n /= f;
        }
    }
    if (n > 1) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(n);
    }
    IO.println(sb);
}
