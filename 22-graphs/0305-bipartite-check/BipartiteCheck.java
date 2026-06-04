import java.util.*;

public class BipartiteCheck {
    static boolean isBipartite(int n, int[][] edges) {
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int s = 0; s < n; s++) {
            if (color[s] != -1) continue;
            color[s] = 0;
            Deque<Integer> q = new ArrayDeque<>();
            q.add(s);
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : g[u]) {
                    if (color[v] == -1) {
                        color[v] = color[u] ^ 1;
                        q.add(v);
                    } else if (color[v] == color[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] cycle4 = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
        int[][] triangle = {{0, 1}, {1, 2}, {2, 0}};
        String a = isBipartite(4, cycle4) ? "yes" : "no";
        String b = isBipartite(3, triangle) ? "yes" : "no";
        System.out.println(a + " " + b);
    }
}
