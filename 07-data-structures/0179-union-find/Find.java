public class Find {
    static int[] parent;

    static int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    static void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    static boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public static void main(String[] args) {
        parent = new int[4];
        for (int i = 0; i < parent.length; i++) parent[i] = i;

        union(0, 1);
        union(2, 3);
        System.out.println((connected(0, 1) ? "yes" : "no") + " " + (connected(0, 2) ? "yes" : "no"));
    }
}
