import java.util.PriorityQueue;
import java.util.StringJoiner;

void main() {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (var n : new int[]{3, 1, 2}) {
        pq.add(n);
    }

    var out = new StringJoiner(" ");
    while (!pq.isEmpty()) {
        out.add(String.valueOf(pq.poll()));
    }
    System.out.println(out);
}
