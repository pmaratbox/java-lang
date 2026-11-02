void main() {
    int[] nums = {1, 2, 3, 4};
    var size = 2;
    for (var i = 0; i + size <= nums.length; i++) {
        var sb = new StringBuilder();
        for (var j = i; j < i + size; j++) {
            if (j > i) sb.append(" ");
            sb.append(nums[j]);
        }
        System.out.println(sb);
    }
}
