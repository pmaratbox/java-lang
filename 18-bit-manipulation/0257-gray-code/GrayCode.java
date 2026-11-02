void main() {
    var sb = new StringBuilder();
    for (var n = 0; n < 4; n++) {
        if (n > 0) sb.append(' ');
        sb.append(n ^ (n >> 1));
    }
    IO.println(sb);
}
