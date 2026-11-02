void main() {
    var n = 13;
    var count = 0;
    while (n != 0) {
        n &= (n - 1);
        count++;
    }
    IO.println(count);
}
