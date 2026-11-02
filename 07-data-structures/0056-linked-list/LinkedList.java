static class Node {
    int value;
    Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

void main() {
    var head = new Node(1, new Node(2, new Node(3, null)));

    var out = new StringBuilder();
    for (var node = head; node != null; node = node.next) {
        if (out.length() > 0) out.append(" -> ");
        out.append(node.value);
    }
    System.out.println(out);
}
