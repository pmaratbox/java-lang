import java.util.ArrayList;
import java.util.List;

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

void main() {
    var it = new RangeIterator(1, 3);
    List<String> out = new ArrayList<>();
    while (it.hasNext()) {
        out.add(String.valueOf(it.next()));
    }
    IO.println(String.join(" ", out));
}
