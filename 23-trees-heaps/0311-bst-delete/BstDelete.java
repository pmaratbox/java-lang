public class BstDelete {
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insert(n.left, v);
        else if (v > n.val) n.right = insert(n.right, v);
        return n;
    }

    static Node delete(Node n, int v) {
        if (n == null) return null;
        if (v < n.val) n.left = delete(n.left, v);
        else if (v > n.val) n.right = delete(n.right, v);
        else {
            if (n.left == null) return n.right;
            if (n.right == null) return n.left;
            Node s = n.right;
            while (s.left != null) s = s.left;
            n.val = s.val;
            n.right = delete(n.right, s.val);
        }
        return n;
    }

    static void inorder(Node n, StringBuilder sb) {
        if (n == null) return;
        inorder(n.left, sb);
        if (sb.length() > 0) sb.append(' ');
        sb.append(n.val);
        inorder(n.right, sb);
    }

    public static void main(String[] args) {
        Node root = null;
        for (int v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);
        root = delete(root, 3);
        StringBuilder sb = new StringBuilder();
        inorder(root, sb);
        System.out.println(sb);
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
