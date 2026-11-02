public class SegmentTreeSum {
    int[] tree;
    int n;

    SegmentTreeSum(int[] a) {
        n = a.length;
        tree = new int[2 * n];
        for (var i = 0; i < n; i++) tree[n + i] = a[i];
        for (var i = n - 1; i > 0; i--) tree[i] = tree[2 * i] + tree[2 * i + 1];
    }

    int query(int l, int r) {
        var sum = 0;
        for (l += n, r += n + 1; l < r; l /= 2, r /= 2) {
            if ((l & 1) == 1) sum += tree[l++];
            if ((r & 1) == 1) sum += tree[--r];
        }
        return sum;
    }

    static void main() {
        var st = new SegmentTreeSum(new int[]{1, 2, 3, 4, 5});
        IO.println(st.query(1, 3));
    }
}
