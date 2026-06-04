public class ExpressionAst {
    public static void main(String[] args) {
        // AST for "1+2*3": Add(Num(1), Mul(Num(2), Num(3)))
        Node ast = new Add(new Num(1), new Mul(new Num(2), new Num(3)));
        System.out.println(ast.eval());
    }
}

interface Node {
    int eval();
}

class Num implements Node {
    final int value;
    Num(int value) { this.value = value; }
    public int eval() { return value; }
}

class Add implements Node {
    final Node left, right;
    Add(Node left, Node right) { this.left = left; this.right = right; }
    public int eval() { return left.eval() + right.eval(); }
}

class Mul implements Node {
    final Node left, right;
    Mul(Node left, Node right) { this.left = left; this.right = right; }
    public int eval() { return left.eval() * right.eval(); }
}
