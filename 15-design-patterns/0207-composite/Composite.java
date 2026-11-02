import java.util.ArrayList;
import java.util.List;

interface Node {
    int size();
}

static class Leaf implements Node {
    final int value;
    Leaf(int value) { this.value = value; }
    public int size() { return value; }
}

static class Group implements Node {
    final List<Node> children = new ArrayList<>();
    Group add(Node n) { children.add(n); return this; }
    public int size() {
        var total = 0;
        for (var n : children) total += n.size();
        return total;
    }
}

void main() {
    var root = new Group();
    root.add(new Leaf(1)).add(new Leaf(2)).add(new Leaf(3));
    System.out.println(root.size());
}
