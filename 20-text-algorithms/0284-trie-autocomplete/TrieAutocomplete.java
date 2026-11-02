import java.util.TreeMap;

public class TrieAutocomplete {
    void main() {
        var root = new Node();
        for (var w : new String[]{"car", "card", "dog"}) insert(root, w);
        var node = root;
        var prefix = "car";
        for (var c : prefix.toCharArray()) node = node.children.get(c);
        var sb = new StringBuilder();
        collect(node, prefix, sb);
        IO.println(sb.toString().trim());
    }

    static void insert(Node root, String w) {
        var cur = root;
        for (var c : w.toCharArray())
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
