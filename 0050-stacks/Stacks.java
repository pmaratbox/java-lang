import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n = 1; n <= 3; n++) {
            stack.push(n);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
