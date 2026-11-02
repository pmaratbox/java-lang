void main() {
    var n = 3;
    var INF = 1 << 29;
    var d = new int[n][n];
    for (var i = 0; i < n; i++)
        for (var j = 0; j < n; j++)
            d[i][j] = (i == j) ? 0 : INF;
    d[0][1] = 3;
    d[1][2] = 1;
    d[0][2] = 5;
    for (var k = 0; k < n; k++)
        for (var i = 0; i < n; i++)
            for (var j = 0; j < n; j++)
                if (d[i][k] + d[k][j] < d[i][j])
                    d[i][j] = d[i][k] + d[k][j];
    IO.println(d[0][2]);
}
