public class TreeDiameter {
    static int best = 0;

    static int height(Node n) {
        if (n == null) return 0;
        var l = height(n.left);
        var r = height(n.right);
        best = Math.max(best, l + r);
        return 1 + Math.max(l, r);
    }

    void main() {
        Node c = new Node("C"), d = new Node("D");
        var a = new Node("A", c, d);
        var b = new Node("B");
        var root = new Node("root", a, b);
        height(root);
        IO.println(best);
    }
}

class Node {
    String name;
    Node left, right;
    Node(String n) { name = n; }
    Node(String n, Node l, Node r) { name = n; left = l; right = r; }
}
