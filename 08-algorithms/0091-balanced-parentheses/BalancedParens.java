import java.util.ArrayDeque;
import java.util.Deque;

static boolean isBalanced(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (var ch : s.toCharArray()) {
        if (ch == '(') {
            stack.push(ch);
        } else if (ch == ')') {
            if (stack.isEmpty()) return false;
            stack.pop();
        }
    }
    return stack.isEmpty();
}

void main() {
    for (var s : new String[]{"(())", "(()"}) {
        IO.println(isBalanced(s) ? "yes" : "no");
    }
}
