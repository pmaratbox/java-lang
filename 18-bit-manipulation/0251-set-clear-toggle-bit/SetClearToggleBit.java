void main() {
    var set = 0 | (1 << 1);
    var clear = 2 & ~(1 << 1);
    var toggle = 0 ^ (1 << 1);
    IO.println(set + " " + clear + " " + toggle);
}
