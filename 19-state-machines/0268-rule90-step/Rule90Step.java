void main() {
    int[] row = {0, 0, 1, 0, 0};
    var n = row.length;
    var next = new int[n];
    for (var i = 0; i < n; i++) {
        var left = (i - 1 >= 0) ? row[i - 1] : 0;
        var right = (i + 1 < n) ? row[i + 1] : 0;
        next[i] = left ^ right;
    }
    var sb = new StringBuilder();
    for (var v : next) sb.append(v);
    System.out.println(sb.toString());
}
