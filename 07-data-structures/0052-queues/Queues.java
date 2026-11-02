import java.util.ArrayDeque;
import java.util.StringJoiner;

void main() {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);

    var out = new StringJoiner(" ");
    while (!queue.isEmpty()) {
        out.add(String.valueOf(queue.poll()));
    }
    System.out.println(out);
}
