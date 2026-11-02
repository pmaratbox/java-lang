import java.util.PriorityQueue;

void main() {
    var k = 2;
    int[] nums = {3, 2, 1, 5, 6, 4};
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (var v : nums) {
        heap.add(v);
        if (heap.size() > k) heap.poll();
    }
    System.out.println(heap.peek());
}
