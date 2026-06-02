public class ChunkList {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int size = 3;
        for (int i = 0; i < nums.length; i += size) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + size && j < nums.length; j++) {
                if (j > i) sb.append(" ");
                sb.append(nums[j]);
            }
            System.out.println(sb);
        }
    }
}
