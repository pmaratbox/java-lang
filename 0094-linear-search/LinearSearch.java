public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};
        int target = 7;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("found " + target + " at index " + index);
    }
}
