void main() {
    var x = 1;
    var r = 0;
    for (var i = 0; i < 8; i++) {
        r = (r << 1) | ((x >> i) & 1);
    }
    System.out.println(r);
}
