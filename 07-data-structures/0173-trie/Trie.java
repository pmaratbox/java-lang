import java.util.HashMap;
import java.util.Map;

public class Trie {
    static class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean end;
    }

    static Node root = new Node();

    static void insert(String word) {
        Node n = root;
        for (char c : word.toCharArray()) {
            n = n.children.computeIfAbsent(c, k -> new Node());
        }
        n.end = true;
    }

    static boolean search(String word) {
        Node n = root;
        for (char c : word.toCharArray()) {
            n = n.children.get(c);
            if (n == null) return false;
        }
        return n.end;
    }

    public static void main(String[] args) {
        insert("cat");
        insert("car");
        System.out.println((search("car") ? "yes" : "no") + " " + (search("can") ? "yes" : "no"));
    }
}
