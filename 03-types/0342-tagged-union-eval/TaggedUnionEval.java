public class TaggedUnionEval {
    sealed interface Expr permits Num, Add {}
    record Num(int value) implements Expr {}
    record Add(Expr left, Expr right) implements Expr {}

    static int eval(Expr e) {
        return switch (e) {
            case Num n -> n.value();
            case Add a -> eval(a.left()) + eval(a.right());
        };
    }

    public static void main(String[] args) {
        Expr expr = new Add(new Num(1), new Num(2));
        System.out.println(eval(expr));
    }
}
