import java.util.ArrayDeque;
import java.util.Deque;

public class BracketMatching {
    public static void main(String[] args) {
        System.out.println((balanced("([{}])") ? "yes" : "no") + " "
                + (balanced("([)]") ? "yes" : "no"));
    }

    static boolean balanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': case '[': case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
