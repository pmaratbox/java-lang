void main() {
    int[] temps = {100, 0};
    for (var c : temps) {
        var f = c * 9 / 5 + 32;
        System.out.println(c + "C = " + f + "F");
    }
}
