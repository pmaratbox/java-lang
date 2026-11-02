import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringJoiner;

void main() {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    for (var v : new int[]{3, 1, 4, 1, 5}) heap.add(v);

    var sj = new StringJoiner(" ");
    for (var i = 0; i < 3; i++) sj.add(String.valueOf(heap.poll()));
    IO.println(sj);
}
