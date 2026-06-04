import java.util.ArrayDeque;
import java.util.StringJoiner;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addFirst(0);
        StringJoiner sj = new StringJoiner(" ");
        for (int value : deque) {
            sj.add(Integer.toString(value));
        }
        System.out.println(sj);
    }
}
