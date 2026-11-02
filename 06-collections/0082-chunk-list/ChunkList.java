void main() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    var size = 3;
    for (var i = 0; i < nums.length; i += size) {
        var sb = new StringBuilder();
        for (var j = i; j < i + size && j < nums.length; j++) {
            if (j > i) sb.append(" ");
            sb.append(nums[j]);
        }
        IO.println(sb);
    }
}
