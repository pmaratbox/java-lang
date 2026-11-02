static boolean isPerfect(int n) {
    var sum = 0;
    for (var i = 1; i < n; i++) {
        if (n % i == 0) sum += i;
    }
    return sum == n;
}

void main() {
    var a = isPerfect(6) ? "yes" : "no";
    var b = isPerfect(8) ? "yes" : "no";
    IO.println(a + " " + b);
}
