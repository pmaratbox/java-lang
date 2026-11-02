void main() {
    var rows = 4;
    int[] row = {1};
    for (var r = 0; r < rows; r++) {
        var next = new int[r + 2];
        var sb = new StringBuilder();
        for (var i = 0; i <= r; i++) {
            if (i > 0) sb.append(' ');
            sb.append(row[i]);
            next[i] += row[i];
            next[i + 1] += row[i];
        }
        IO.println(sb);
        row = next;
    }
}
