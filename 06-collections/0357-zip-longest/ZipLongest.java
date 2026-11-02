import java.util.List;

void main() {
    var a = List.of(1, 2, 3);
    var b = List.of("a", "b");
    var n = Math.max(a.size(), b.size());
    var sb = new StringBuilder();
    for (var i = 0; i < n; i++) {
        var left = i < a.size() ? a.get(i).toString() : "-";
        var right = i < b.size() ? b.get(i) : "-";
        if (i > 0) sb.append(' ');
        sb.append(left).append(right);
    }
    System.out.println(sb);
}
