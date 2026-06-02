public class LinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, null)));

        StringBuilder out = new StringBuilder();
        for (Node node = head; node != null; node = node.next) {
            if (out.length() > 0) out.append(" -> ");
            out.append(node.value);
        }
        System.out.println(out);
    }
}
