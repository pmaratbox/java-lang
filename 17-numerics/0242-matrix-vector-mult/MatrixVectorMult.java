public class MatrixVectorMult {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        int[] v = {5, 6};
        int[] out = new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                out[i] += m[i][j] * v[j];
            }
        }
        System.out.println(out[0] + " " + out[1]);
    }
}
