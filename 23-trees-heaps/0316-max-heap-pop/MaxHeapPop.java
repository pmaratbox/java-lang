import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringJoiner;

public class MaxHeapPop {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int v : new int[]{3, 1, 4, 1, 5}) heap.add(v);

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < 3; i++) sj.add(String.valueOf(heap.poll()));
        System.out.println(sj);
    }
}
