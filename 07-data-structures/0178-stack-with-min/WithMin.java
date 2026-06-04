import java.util.ArrayDeque;
import java.util.Deque;

public class WithMin {
    static Deque<Integer> stack = new ArrayDeque<>();
    static Deque<Integer> mins = new ArrayDeque<>();

    static void push(int x) {
        stack.push(x);
        mins.push(mins.isEmpty() ? x : Math.min(x, mins.peek()));
    }

    static int getMin() {
        return mins.peek();
    }

    public static void main(String[] args) {
        push(3);
        push(1);
        push(2);
        System.out.println("min: " + getMin());
    }
}
