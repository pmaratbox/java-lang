import java.util.*;

public class BellmanFord {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1, 1}, {1, 2, -2}, {0, 2, 4}};
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int[] e : edges) {
                int u = e[0], v = e[1], w = e[2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(dist[i]);
        }
        System.out.println(sb);
    }
}
