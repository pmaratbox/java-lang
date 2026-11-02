import java.util.StringJoiner;

void main() {
    int[] nums = {1, 2, 3, 4};
    var sums = new int[nums.length];
    var total = 0;
    for (var i = 0; i < nums.length; i++) {
        total += nums[i];
        sums[i] = total;
    }

    var out = new StringJoiner(" ");
    for (var x : sums) {
        out.add(String.valueOf(x));
    }
    System.out.println(out);
}
