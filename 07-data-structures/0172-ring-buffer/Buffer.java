public class Buffer {
    public static void main(String[] args) {
        int cap = 3;
        int[] buf = new int[cap];
        int head = 0, size = 0;

        for (int v : new int[]{1, 2, 3, 4, 5}) {
            int tail = (head + size) % cap;
            buf[tail] = v;
            if (size < cap) size++;
            else head = (head + 1) % cap;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(' ');
            sb.append(buf[(head + i) % cap]);
        }
        System.out.println(sb);
    }
}
