import java.util.function.IntBinaryOperator;
import java.util.StringJoiner;

static int[] zipWith(IntBinaryOperator f, int[] a, int[] b) {
    var n = Math.min(a.length, b.length);
    var out = new int[n];
    for (var i = 0; i < n; i++) out[i] = f.applyAsInt(a[i], b[i]);
    return out;
}

void main() {
    var r = zipWith((x, y) -> x + y, new int[]{1, 2, 3}, new int[]{4, 5, 6});
    var sj = new StringJoiner(" ");
    for (var v : r) sj.add(String.valueOf(v));
    System.out.println(sj);
}
