void main() {
    int[][] m = {{1, 2}, {3, 4}};
    int[] v = {5, 6};
    var out = new int[2];
    for (var i = 0; i < 2; i++) {
        for (var j = 0; j < 2; j++) {
            out[i] += m[i][j] * v[j];
        }
    }
    System.out.println(out[0] + " " + out[1]);
}
