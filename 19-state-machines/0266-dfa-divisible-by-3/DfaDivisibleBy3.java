static boolean divisibleBy3(String bits) {
    var state = 0;
    for (var ch : bits.toCharArray()) {
        var b = ch - '0';
        state = (state * 2 + b) % 3;
    }
    return state == 0;
}

void main() {
    var a = divisibleBy3("110") ? "yes" : "no";
    var b = divisibleBy3("100") ? "yes" : "no";
    IO.println(a + " " + b);
}
