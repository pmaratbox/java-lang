public class CircularQueue {
    private final int[] data;
    private final int capacity;
    private int head = 0;
    private int size = 0;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    void enqueue(int value) {
        data[(head + size) % capacity] = value;
        size++;
    }

    int dequeue() {
        var value = data[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    static void main() {
        var q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        var sb = new StringBuilder();
        for (var i = 0; i < q.size; i++) {
            if (i > 0) sb.append(' ');
            sb.append(q.data[(q.head + i) % q.capacity]);
        }
        IO.println(sb);
    }
}
