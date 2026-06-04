import java.util.*;

public class SccCount {
    static List<Integer>[] g;
    static int[] ids, low;
    static boolean[] onStack;
    static Deque<Integer> stack;
    static int idCounter = 0, sccCount = 0;

    public static void main(String[] args) {
        int n = 4;
        g = new List[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}, {2, 3}};
        for (int[] e : edges) g[e[0]].add(e[1]);
        ids = new int[n];
        low = new int[n];
        Arrays.fill(ids, -1);
        onStack = new boolean[n];
        stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (ids[i] == -1) dfs(i);
        System.out.println(sccCount);
    }

    static void dfs(int u) {
        ids[u] = low[u] = idCounter++;
        stack.push(u);
        onStack[u] = true;
        for (int v : g[u]) {
            if (ids[v] == -1) {
                dfs(v);
                low[u] = Math.min(low[u], low[v]);
            } else if (onStack[v]) {
                low[u] = Math.min(low[u], ids[v]);
            }
        }
        if (ids[u] == low[u]) {
            while (true) {
                int w = stack.pop();
                onStack[w] = false;
                if (w == u) break;
            }
            sccCount++;
        }
    }
}
