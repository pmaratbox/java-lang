import java.util.ArrayDeque;
import java.util.Deque;

void main() {
    var expr = "3 4 + 5 *";
    Deque<Integer> stack = new ArrayDeque<>();
    for (var tok : expr.split(" ")) {
        switch (tok) {
            case "+": stack.push(stack.pop() + stack.pop()); break;
            case "*": stack.push(stack.pop() * stack.pop()); break;
            case "-": { int b = stack.pop(); stack.push(stack.pop() - b); break; }
            case "/": { int b = stack.pop(); stack.push(stack.pop() / b); break; }
            default: stack.push(Integer.parseInt(tok));
        }
    }
    IO.println(stack.pop());
}
