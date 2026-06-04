import java.util.TreeMap;

public class TrieAutocomplete {
    public static void main(String[] args) {
        Node root = new Node();
        for (String w : new String[]{"car", "card", "dog"}) insert(root, w);
        Node node = root;
        String prefix = "car";
        for (char c : prefix.toCharArray()) node = node.children.get(c);
        StringBuilder sb = new StringBuilder();
        collect(node, prefix, sb);
        System.out.println(sb.toString().trim());
    }

    static void insert(Node root, String w) {
        Node cur = root;
        for (char c : w.toCharArray())
            cur = cur.children.computeIfAbsent(c, k -> new Node());
        cur.word = true;
    }

    static void collect(Node node, String prefix, StringBuilder sb) {
        if (node.word) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(prefix);
        }
        for (var e : node.children.entrySet())
            collect(e.getValue(), prefix + e.getKey(), sb);
    }
}

class Node {
    TreeMap<Character, Node> children = new TreeMap<>();
    boolean word = false;
}
