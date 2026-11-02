import java.util.List;

static List<List<Integer>> adj = List.of(
    List.of(1, 2),
    List.of(0, 3),
    List.of(0, 3),
    List.of(1, 2)
);
static boolean[] visited = new boolean[4];
static StringBuilder sb = new StringBuilder();

static void dfs(int node) {
    visited[node] = true;
    if (sb.length() > 0) sb.append(' ');
    sb.append(node);
    for (int next : adj.get(node)) {
        if (!visited[next]) dfs(next);
    }
}

void main() {
    dfs(0);
    System.out.println(sb);
}
