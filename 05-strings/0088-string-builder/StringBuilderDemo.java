public class StringBuilderDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) sb.append("-");
            sb.append(nums[i]);
        }
        System.out.println(sb);
    }
}
