void main() {
    int[][] a = {{1, 2}, {3, 4}};
    int[][] b = {{5, 6}, {7, 8}};
    var n = 2;
    var result = new int[n][n];
    for (var i = 0; i < n; i++) {
        for (var j = 0; j < n; j++) {
            for (var k = 0; k < n; k++) {
                result[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    for (var row : result) {
        var sb = new StringBuilder();
        for (var j = 0; j < n; j++) {
            if (j > 0) sb.append(" ");
            sb.append(row[j]);
        }
        IO.println(sb);
    }
}
