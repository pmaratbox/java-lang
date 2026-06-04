import java.util.List;

public class ZipLongest {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        List<String> b = List.of("a", "b");
        int n = Math.max(a.size(), b.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String left = i < a.size() ? a.get(i).toString() : "-";
            String right = i < b.size() ? b.get(i) : "-";
            if (i > 0) sb.append(' ');
            sb.append(left).append(right);
        }
        System.out.println(sb);
    }
}
