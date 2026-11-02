public class BstSearch {
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insert(n.left, v);
        else if (v > n.val) n.right = insert(n.right, v);
        return n;
    }

    static boolean search(Node n, int v) {
        while (n != null) {
            if (v == n.val) return true;
            n = v < n.val ? n.left : n.right;
        }
        return false;
    }

    void main() {
        Node root = null;
        for (var v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);
        IO.println((search(root, 4) ? "yes" : "no") + " " +
                           (search(root, 6) ? "yes" : "no"));
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
