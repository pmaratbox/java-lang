void main() {
    for (var i = 1; i <= 3; i++) {
        var sb = new StringBuilder();
        for (var j = 1; j <= 3; j++) {
            if (j > 1) sb.append(' ');
            sb.append(i * j);
        }
        IO.println(sb);
    }
}
