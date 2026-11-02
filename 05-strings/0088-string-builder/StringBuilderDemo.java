void main() {
    int[] nums = {1, 2, 3};
    var sb = new StringBuilder();
    for (var i = 0; i < nums.length; i++) {
        if (i > 0) sb.append("-");
        sb.append(nums[i]);
    }
    System.out.println(sb);
}
