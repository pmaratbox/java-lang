void main() {
    var sb = new StringBuilder();
    long c = 1;
    for (var n = 0; n < 5; n++) {
        if (n > 0) sb.append(' ');
        sb.append(c);
        c = c * 2 * (2 * n + 1) / (n + 2);
    }
    System.out.println(sb);
}
