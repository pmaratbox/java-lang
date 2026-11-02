import java.util.function.IntBinaryOperator;

static IntBinaryOperator select(String name) {
    switch (name) {
        case "add": return (a, b) -> a + b;
        case "mul": return (a, b) -> a * b;
        default: throw new IllegalArgumentException(name);
    }
}

void main() {
    var add = select("add");
    var mul = select("mul");
    IO.println(add.applyAsInt(3, 4) + " " + mul.applyAsInt(3, 4));
}
