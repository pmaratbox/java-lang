import java.util.*;

public class KruskalMst {
    static int[] parent;

    static int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1, 1}, {1, 2, 2}, {0, 2, 3}};
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int total = 0;
        for (int[] e : edges) {
            int a = find(e[0]), b = find(e[1]);
            if (a != b) {
                parent[a] = b;
                total += e[2];
            }
        }
        System.out.println(total);
    }
}
