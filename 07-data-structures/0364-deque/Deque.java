import java.util.ArrayDeque;
import java.util.StringJoiner;

void main() {
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    deque.addLast(1);
    deque.addLast(2);
    deque.addFirst(0);
    var sj = new StringJoiner(" ");
    for (int value : deque) {
        sj.add(Integer.toString(value));
    }
    System.out.println(sj);
}
