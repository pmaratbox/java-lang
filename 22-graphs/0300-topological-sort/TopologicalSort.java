import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        int n = 4;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        int[] indeg = new int[n];
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}};
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            indeg[e[1]]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) if (indeg[i] == 0) pq.add(i);
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (sb.length() > 0) sb.append(' ');
            sb.append(u);
            for (int v : g[u]) {
                if (--indeg[v] == 0) pq.add(v);
            }
        }
        System.out.println(sb);
    }
}
