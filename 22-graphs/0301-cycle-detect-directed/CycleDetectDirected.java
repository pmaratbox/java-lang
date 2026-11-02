import java.util.*;

static List<Integer>[] g;
static int[] color; // 0 white, 1 gray, 2 black

void main() {
    var n = 3;
    g = new List[n];
    for (var i = 0; i < n; i++) g[i] = new ArrayList<>();
    int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
    for (var e : edges) g[e[0]].add(e[1]);
    color = new int[n];
    var cycle = false;
    for (var i = 0; i < n; i++) {
        if (color[i] == 0 && dfs(i)) {
            cycle = true;
            break;
        }
    }
    System.out.println(cycle ? "cycle" : "acyclic");
}

static boolean dfs(int u) {
    color[u] = 1;
    for (int v : g[u]) {
        if (color[v] == 1) return true;
        if (color[v] == 0 && dfs(v)) return true;
    }
    color[u] = 2;
    return false;
}
