import java.util.*;

public class PrimMst {
    public static void main(String[] args) {
        int n = 4;
        List<int[]>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        int[][] edges = {{0, 1, 1}, {1, 2, 2}, {2, 3, 3}};
        for (int[] e : edges) {
            g[e[0]].add(new int[]{e[1], e[2]});
            g[e[1]].add(new int[]{e[0], e[2]});
        }
        boolean[] in = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{0, 0});
        int total = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0], w = cur[1];
            if (in[u]) continue;
            in[u] = true;
            total += w;
            for (int[] e : g[u]) {
                if (!in[e[0]]) pq.add(new int[]{e[0], e[1]});
            }
        }
        System.out.println(total);
    }
}
