public class ValidateBst {
    static boolean valid(Node n, long low, long high) {
        if (n == null) return true;
        if (n.val <= low || n.val >= high) return false;
        return valid(n.left, low, n.val) && valid(n.right, n.val, high);
    }

    public static void main(String[] args) {
        Node good = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8));
        Node bad = new Node(5, new Node(3, new Node(1), new Node(6)), new Node(8));
        System.out.println(
            (valid(good, Long.MIN_VALUE, Long.MAX_VALUE) ? "yes" : "no") + " " +
            (valid(bad, Long.MIN_VALUE, Long.MAX_VALUE) ? "yes" : "no"));
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
    Node(int v, Node l, Node r) { val = v; left = l; right = r; }
}
