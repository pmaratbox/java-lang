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

    public static void main(String[] args) {
        Node root = null;
        for (int v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);
        System.out.println((search(root, 4) ? "yes" : "no") + " " +
                           (search(root, 6) ? "yes" : "no"));
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
