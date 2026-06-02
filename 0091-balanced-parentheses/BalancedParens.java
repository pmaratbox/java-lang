import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParens {
    static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        for (String s : new String[]{"(())", "(()"}) {
            System.out.println(isBalanced(s) ? "yes" : "no");
        }
    }
}
