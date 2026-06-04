import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringJoiner;

public class LevelOrderTraversal {
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insert(n.left, v);
        else if (v > n.val) n.right = insert(n.right, v);
        return n;
    }

    public static void main(String[] args) {
        Node root = null;
        for (int v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);

        StringJoiner sj = new StringJoiner(" ");
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            sj.add(String.valueOf(n.val));
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
        System.out.println(sj);
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
