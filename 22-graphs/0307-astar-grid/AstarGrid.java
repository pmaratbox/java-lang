import java.util.*;

public class AstarGrid {
    public static void main(String[] args) {
        int n = 3;
        int sr = 0, sc = 0, gr = 2, gc = 2;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] g = new int[n][n];
        for (int[] row : g) Arrays.fill(row, Integer.MAX_VALUE);
        g[sr][sc] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{h(sr, sc, gr, gc), sr, sc});
        int answer = -1;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[1], c = cur[2];
            if (r == gr && c == gc) {
                answer = g[r][c];
                break;
            }
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if (g[r][c] + 1 < g[nr][nc]) {
                    g[nr][nc] = g[r][c] + 1;
                    pq.add(new int[]{g[nr][nc] + h(nr, nc, gr, gc), nr, nc});
                }
            }
        }
        System.out.println(answer);
    }

    static int h(int r, int c, int gr, int gc) {
        return Math.abs(r - gr) + Math.abs(c - gc);
    }
}
