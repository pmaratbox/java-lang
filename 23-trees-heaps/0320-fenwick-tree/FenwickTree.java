public class FenwickTree {
    int[] bit;

    FenwickTree(int size) {
        bit = new int[size + 1];
    }

    void update(int i, int delta) {
        for (i++; i < bit.length; i += i & (-i)) bit[i] += delta;
    }

    int prefix(int i) {
        int sum = 0;
        for (; i > 0; i -= i & (-i)) sum += bit[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        FenwickTree ft = new FenwickTree(a.length);
        for (int i = 0; i < a.length; i++) ft.update(i, a[i]);
        System.out.println(ft.prefix(4));
    }
}
