public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                if (i > 0) sb.append(" ");
                sb.append(matrix[i][j]);
            }
            System.out.println(sb);
        }
    }
}
