import java.util.ArrayDeque;
import java.util.StringJoiner;

public class Queues {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        StringJoiner out = new StringJoiner(" ");
        while (!queue.isEmpty()) {
            out.add(String.valueOf(queue.poll()));
        }
        System.out.println(out);
    }
}
