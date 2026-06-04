public class TreeHeight {
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insert(n.left, v);
        else if (v > n.val) n.right = insert(n.right, v);
        return n;
    }

    static int height(Node n) {
        if (n == null) return 0;
        return 1 + Math.max(height(n.left), height(n.right));
    }

    public static void main(String[] args) {
        Node root = null;
        for (int v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);
        System.out.println(height(root));
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
