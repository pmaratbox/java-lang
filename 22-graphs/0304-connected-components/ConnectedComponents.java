import java.util.*;

public class ConnectedComponents {
    static int[] parent;

    static int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public static void main(String[] args) {
        int n = 5;
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        for (int[] e : edges) {
            int a = find(e[0]), b = find(e[1]);
            if (a != b) parent[a] = b;
        }
        Set<Integer> roots = new HashSet<>();
        for (int i = 0; i < n; i++) roots.add(find(i));
        System.out.println(roots.size());
    }
}
