void main() {
    var program = "+++";
    var cell = 0;
    for (var c : program.toCharArray()) {
        if (c == '+') cell++;
        else if (c == '-') cell--;
    }
    System.out.println(cell);
}
