static int total(int... nums) {
    var sum = 0;
    for (var n : nums) {
        sum += n;
    }
    return sum;
}

void main() {
    IO.println("sum: " + total(1, 2, 3));
}
