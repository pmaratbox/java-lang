import java.util.HashMap;
import java.util.Map;

static class Node {
    Map<Character, Node> children = new HashMap<>();
    boolean end;
}

static Node root = new Node();

static void insert(String word) {
    var n = root;
    for (var c : word.toCharArray()) {
        n = n.children.computeIfAbsent(c, k -> new Node());
    }
    n.end = true;
}

static boolean search(String word) {
    var n = root;
    for (var c : word.toCharArray()) {
        n = n.children.get(c);
        if (n == null) return false;
    }
    return n.end;
}

void main() {
    insert("cat");
    insert("car");
    System.out.println((search("car") ? "yes" : "no") + " " + (search("can") ? "yes" : "no"));
}
