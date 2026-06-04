import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    static class RangeIterator {
        int current;
        final int end;
        RangeIterator(int start, int end) {
            this.current = start;
            this.end = end;
        }
        boolean hasNext() { return current <= end; }
        int next() { return current++; }
    }

    public static void main(String[] args) {
        RangeIterator it = new RangeIterator(1, 3);
        List<String> out = new ArrayList<>();
        while (it.hasNext()) {
            out.add(String.valueOf(it.next()));
        }
        System.out.println(String.join(" ", out));
    }
}
