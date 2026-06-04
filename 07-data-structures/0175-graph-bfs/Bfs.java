import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        List<List<Integer>> adj = List.of(
            List.of(1, 2),
            List.of(0, 3),
            List.of(0, 3),
            List.of(1, 2)
        );

        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        visited[0] = true;

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            int node = queue.remove();
            if (sb.length() > 0) sb.append(' ');
            sb.append(node);
            for (int next : adj.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        System.out.println(sb);
    }
}
