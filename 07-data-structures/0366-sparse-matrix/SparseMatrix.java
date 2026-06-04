import java.util.HashMap;
import java.util.Map;

public class SparseMatrix {
    private final Map<Long, Integer> entries = new HashMap<>();

    private long key(int row, int col) {
        return ((long) row << 32) | (col & 0xffffffffL);
    }

    void set(int row, int col, int value) {
        if (value == 0) {
            entries.remove(key(row, col));
        } else {
            entries.put(key(row, col), value);
        }
    }

    int get(int row, int col) {
        return entries.getOrDefault(key(row, col), 0);
    }

    public static void main(String[] args) {
        SparseMatrix matrix = new SparseMatrix();
        matrix.set(1, 1, 5);
        System.out.println(matrix.get(1, 1) + " " + matrix.get(0, 0));
    }
}
