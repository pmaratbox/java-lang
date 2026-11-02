static void countdown(int n, StringBuilder sb) {
    if (n < 1) return;
    if (sb.length() > 0) sb.append(' ');
    sb.append(n);
    countdown(n - 1, sb);
}

void main() {
    var sb = new StringBuilder();
    countdown(5, sb);
    IO.println(sb.toString());
}
