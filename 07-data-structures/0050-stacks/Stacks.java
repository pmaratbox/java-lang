import java.util.ArrayDeque;
import java.util.Deque;

void main() {
    Deque<Integer> stack = new ArrayDeque<>();
    for (var n = 1; n <= 3; n++) {
        stack.push(n);
    }

    var sb = new StringBuilder();
    while (!stack.isEmpty()) {
        if (sb.length() > 0) sb.append(" ");
        sb.append(stack.pop());
    }
    IO.println(sb);
}
