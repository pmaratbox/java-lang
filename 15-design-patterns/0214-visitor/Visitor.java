import java.util.Arrays;
import java.util.List;

public class Visitor {
    interface Node {
        int accept(SumVisitor v);
    }

    static class Leaf implements Node {
        final int value;
        Leaf(int value) { this.value = value; }
        public int accept(SumVisitor v) { return v.visitLeaf(this); }
    }

    static class SumVisitor {
        int visitLeaf(Leaf leaf) { return leaf.value; }
        int visitAll(List<Node> nodes) {
            int total = 0;
            for (Node n : nodes) total += n.accept(this);
            return total;
        }
    }

    public static void main(String[] args) {
        List<Node> nodes = Arrays.asList(new Leaf(1), new Leaf(2), new Leaf(3));
        System.out.println(new SumVisitor().visitAll(nodes));
    }
}
