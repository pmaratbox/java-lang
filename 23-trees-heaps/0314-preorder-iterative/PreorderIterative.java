import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class PreorderIterative {
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insert(n.left, v);
        else if (v > n.val) n.right = insert(n.right, v);
        return n;
    }

    void main() {
        Node root = null;
        for (var v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);

        var sj = new StringJoiner(" ");
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            sj.add(String.valueOf(n.val));
            if (n.right != null) stack.push(n.right);
            if (n.left != null) stack.push(n.left);
        }
        System.out.println(sj);
    }
}

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}
