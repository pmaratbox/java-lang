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
        int value = data[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q.size; i++) {
            if (i > 0) sb.append(' ');
            sb.append(q.data[(q.head + i) % q.capacity]);
        }
        System.out.println(sb);
    }
}
