void main() {
    var s = "5";
    var left = String.format("%3s", s);
    var right = String.format("%-3s", s);
    System.out.println(left + "|" + right);
}
