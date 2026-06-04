import java.util.ArrayDeque;
import java.util.Deque;

public class RpnEval {
    public static void main(String[] args) {
        String expr = "3 4 + 5 *";
        Deque<Integer> stack = new ArrayDeque<>();
        for (String tok : expr.split(" ")) {
            switch (tok) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "-": { int b = stack.pop(); stack.push(stack.pop() - b); break; }
                case "/": { int b = stack.pop(); stack.push(stack.pop() / b); break; }
                default: stack.push(Integer.parseInt(tok));
            }
        }
        System.out.println(stack.pop());
    }
}
