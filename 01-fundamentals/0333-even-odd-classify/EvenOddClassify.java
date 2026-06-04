public class EvenOddClassify {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(nums[i] % 2 == 0 ? "even" : "odd");
        }
        System.out.println(sb);
    }
}
