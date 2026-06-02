import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BinarySearchTree {
    static class Node {
        int value;
        Node left, right;
        Node(int value) { this.value = value; }
    }

    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }

    static void inorder(Node root, List<Integer> out) {
        if (root == null) return;
        inorder(root.left, out);
        out.add(root.value);
        inorder(root.right, out);
    }

    public static void main(String[] args) {
        Node root = null;
        for (int v : new int[]{5, 3, 8, 1, 4}) root = insert(root, v);
        List<Integer> out = new ArrayList<>();
        inorder(root, out);
        StringJoiner sj = new StringJoiner(" ");
        for (int x : out) sj.add(String.valueOf(x));
        System.out.println(sj);
    }
}
