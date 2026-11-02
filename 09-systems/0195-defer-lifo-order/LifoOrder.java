import java.util.ArrayDeque;
import java.util.Deque;

void main() {
    Deque<Integer> deferred = new ArrayDeque<>();
    for (var i = 1; i <= 3; i++) {
        deferred.push(i);
    }
    var sb = new StringBuilder();
    while (!deferred.isEmpty()) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(deferred.pop());
    }
    System.out.println(sb);
}
