import java.util.Map;
import java.util.function.IntBinaryOperator;

public class Table {
    public static void main(String[] args) {
        Map<String, IntBinaryOperator> ops = Map.of(
            "add", (a, b) -> a + b,
            "mul", (a, b) -> a * b
        );
        int add = ops.get("add").applyAsInt(3, 4);
        int mul = ops.get("mul").applyAsInt(3, 4);
        System.out.println(add + " " + mul);
    }
}
