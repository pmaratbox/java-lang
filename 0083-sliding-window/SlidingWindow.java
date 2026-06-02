public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int size = 2;
        for (int i = 0; i + size <= nums.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + size; j++) {
                if (j > i) sb.append(" ");
                sb.append(nums[j]);
            }
            System.out.println(sb);
        }
    }
}
