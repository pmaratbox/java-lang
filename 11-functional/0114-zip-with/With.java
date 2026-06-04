import java.util.function.IntBinaryOperator;
import java.util.StringJoiner;

public class With {
    static int[] zipWith(IntBinaryOperator f, int[] a, int[] b) {
        int n = Math.min(a.length, b.length);
        int[] out = new int[n];
        for (int i = 0; i < n; i++) out[i] = f.applyAsInt(a[i], b[i]);
        return out;
    }

    public static void main(String[] args) {
        int[] r = zipWith((x, y) -> x + y, new int[]{1, 2, 3}, new int[]{4, 5, 6});
        StringJoiner sj = new StringJoiner(" ");
        for (int v : r) sj.add(String.valueOf(v));
        System.out.println(sj);
    }
}
