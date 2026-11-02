void main() {
    var x = 1;
    var sb = new StringBuilder();
    for (var i = 0; i < 3; i++) {
        x = (5 * x + 3) % 16;
        if (sb.length() > 0) sb.append(' ');
        sb.append(x);
    }
    IO.println(sb);
}
