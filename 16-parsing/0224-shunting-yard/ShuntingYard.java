import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

void main() {
    var expr = "3 + 4 * 2";
    List<String> out = new ArrayList<>();
    Deque<String> ops = new ArrayDeque<>();
    for (var tok : expr.split(" ")) {
        if (isOp(tok)) {
            while (!ops.isEmpty() && prec(ops.peek()) >= prec(tok)) {
                out.add(ops.pop());
            }
            ops.push(tok);
        } else {
            out.add(tok);
        }
    }
    while (!ops.isEmpty()) out.add(ops.pop());
    IO.println(String.join(" ", out));
}

static boolean isOp(String t) {
    return t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/");
}

static int prec(String t) {
    return (t.equals("*") || t.equals("/")) ? 2 : 1;
}
