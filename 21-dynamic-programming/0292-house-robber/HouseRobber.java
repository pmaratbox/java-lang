public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int prev = 0, cur = 0;
        for (int n : nums) {
            int take = prev + n;
            prev = cur;
            cur = Math.max(cur, take);
        }
        System.out.println(cur);
    }
}
