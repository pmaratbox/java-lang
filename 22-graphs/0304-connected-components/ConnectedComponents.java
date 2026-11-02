import java.util.*;

static int[] parent;

static int find(int x) {
    while (parent[x] != x) {
        parent[x] = parent[parent[x]];
        x = parent[x];
    }
    return x;
}

void main() {
    var n = 5;
    parent = new int[n];
    for (var i = 0; i < n; i++) parent[i] = i;
    int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
    for (var e : edges) {
        int a = find(e[0]), b = find(e[1]);
        if (a != b) parent[a] = b;
    }
    Set<Integer> roots = new HashSet<>();
    for (var i = 0; i < n; i++) roots.add(find(i));
    IO.println(roots.size());
}
