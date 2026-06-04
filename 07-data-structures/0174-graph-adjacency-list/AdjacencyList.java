import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        List<List<Integer>> adj = List.of(
            List.of(1, 2),
            List.of(0, 3),
            List.of(0, 3),
            List.of(1, 2)
        );

        StringBuilder sb = new StringBuilder();
        for (int v : adj.get(0)) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(v);
        }
        System.out.println(sb);
    }
}
