public class FloydWarshall {
    public static void main(String[] args) {
        int n = 3;
        int INF = 1 << 29;
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                d[i][j] = (i == j) ? 0 : INF;
        d[0][1] = 3;
        d[1][2] = 1;
        d[0][2] = 5;
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (d[i][k] + d[k][j] < d[i][j])
                        d[i][j] = d[i][k] + d[k][j];
        System.out.println(d[0][2]);
    }
}
