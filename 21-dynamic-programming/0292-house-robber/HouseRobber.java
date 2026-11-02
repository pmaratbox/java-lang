void main() {
    int[] nums = {2, 7, 9, 3, 1};
    int prev = 0, cur = 0;
    for (var n : nums) {
        var take = prev + n;
        prev = cur;
        cur = Math.max(cur, take);
    }
    IO.println(cur);
}
