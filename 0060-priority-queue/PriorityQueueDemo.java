import java.util.PriorityQueue;
import java.util.StringJoiner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : new int[]{3, 1, 2}) {
            pq.add(n);
        }

        StringJoiner out = new StringJoiner(" ");
        while (!pq.isEmpty()) {
            out.add(String.valueOf(pq.poll()));
        }
        System.out.println(out);
    }
}
