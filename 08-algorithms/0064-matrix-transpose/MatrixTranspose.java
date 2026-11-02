void main() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
    var rows = matrix.length;
    var cols = matrix[0].length;

    for (var j = 0; j < cols; j++) {
        var sb = new StringBuilder();
        for (var i = 0; i < rows; i++) {
            if (i > 0) sb.append(" ");
            sb.append(matrix[i][j]);
        }
        System.out.println(sb);
    }
}
