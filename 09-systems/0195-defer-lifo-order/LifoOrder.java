import java.util.ArrayDeque;
import java.util.Deque;

public class LifoOrder {
    public static void main(String[] args) {
        Deque<Integer> deferred = new ArrayDeque<>();
        for (int i = 1; i <= 3; i++) {
            deferred.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!deferred.isEmpty()) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(deferred.pop());
        }
        System.out.println(sb);
    }
}
