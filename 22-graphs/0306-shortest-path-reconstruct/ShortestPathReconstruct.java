import java.util.*;

public class ShortestPathReconstruct {
    public static void main(String[] args) {
        int n = 4;
        List<int[]>[] g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        g[0].add(new int[]{1, 4});
        g[0].add(new int[]{2, 1});
        g[2].add(new int[]{1, 2});
        g[1].add(new int[]{3, 1});
        g[2].add(new int[]{3, 5});

        int[] dist = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0], d = cur[1];
            if (d > dist[u]) continue;
            for (int[] e : g[u]) {
                int v = e[0], w = e[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    prev[v] = u;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
        Deque<Integer> path = new ArrayDeque<>();
        for (int at = 3; at != -1; at = prev[at]) path.push(at);
        System.out.println(String.join(" ",
                path.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
