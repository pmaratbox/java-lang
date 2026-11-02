static class Node {
    int value;
    Node prev, next;
    Node(int value) { this.value = value; }
}

void main() {
    Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3);
    n1.next = n2; n2.prev = n1;
    n2.next = n3; n3.prev = n2;

    var fwd = new StringBuilder();
    for (var n = n1; n != null; n = n.next) {
        if (fwd.length() > 0) fwd.append(' ');
        fwd.append(n.value);
    }
    IO.println(fwd);

    var bwd = new StringBuilder();
    for (var n = n3; n != null; n = n.prev) {
        if (bwd.length() > 0) bwd.append(' ');
        bwd.append(n.value);
    }
    IO.println(bwd);
}
