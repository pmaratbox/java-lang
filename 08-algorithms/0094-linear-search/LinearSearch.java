void main() {
    int[] nums = {4, 2, 7, 1, 9};
    var target = 7;
    var index = -1;
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            index = i;
            break;
        }
    }
    IO.println("found " + target + " at index " + index);
}
