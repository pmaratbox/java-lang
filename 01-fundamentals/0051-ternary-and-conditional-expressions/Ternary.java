void main() {
    for (var n : new int[]{4, 7}) {
        var label = n % 2 == 0 ? "even" : "odd";
        System.out.println(n + ": " + label);
    }
}
