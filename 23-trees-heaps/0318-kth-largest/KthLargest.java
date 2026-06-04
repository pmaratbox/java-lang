import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = {3, 2, 1, 5, 6, 4};
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int v : nums) {
            heap.add(v);
            if (heap.size() > k) heap.poll();
        }
        System.out.println(heap.peek());
    }
}
