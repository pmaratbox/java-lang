public class TreeDiameter {
    static int best = 0;

    static int height(Node n) {
        if (n == null) return 0;
        int l = height(n.left);
        int r = height(n.right);
        best = Math.max(best, l + r);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node c = new Node("C"), d = new Node("D");
        Node a = new Node("A", c, d);
        Node b = new Node("B");
        Node root = new Node("root", a, b);
        height(root);
        System.out.println(best);
    }
}

class Node {
    String name;
    Node left, right;
    Node(String n) { name = n; }
    Node(String n, Node l, Node r) { name = n; left = l; right = r; }
}
