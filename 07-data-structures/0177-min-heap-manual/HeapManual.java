import java.util.ArrayList;
import java.util.List;

public class HeapManual {
    static List<Integer> heap = new ArrayList<>();

    static void push(int x) {
        heap.add(x);
        int i = heap.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(parent) <= heap.get(i)) break;
            swap(i, parent);
            i = parent;
        }
    }

    static int pop() {
        int top = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            int i = 0, n = heap.size();
            while (true) {
                int l = 2 * i + 1, r = 2 * i + 2, smallest = i;
                if (l < n && heap.get(l) < heap.get(smallest)) smallest = l;
                if (r < n && heap.get(r) < heap.get(smallest)) smallest = r;
                if (smallest == i) break;
                swap(i, smallest);
                i = smallest;
            }
        }
        return top;
    }

    static void swap(int a, int b) {
        int t = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, t);
    }

    public static void main(String[] args) {
        push(3);
        push(1);
        push(2);
        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(pop());
        }
        System.out.println(sb);
    }
}
