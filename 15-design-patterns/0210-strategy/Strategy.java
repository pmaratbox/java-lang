import java.util.function.IntBinaryOperator;

public class Strategy {
    static IntBinaryOperator select(String name) {
        switch (name) {
            case "add": return (a, b) -> a + b;
            case "mul": return (a, b) -> a * b;
            default: throw new IllegalArgumentException(name);
        }
    }

    public static void main(String[] args) {
        IntBinaryOperator add = select("add");
        IntBinaryOperator mul = select("mul");
        System.out.println(add.applyAsInt(3, 4) + " " + mul.applyAsInt(3, 4));
    }
}
