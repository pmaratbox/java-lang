void main() {
    var value = 258;
    var high = (value >> 8) & 0xff;
    var low = value & 0xff;
    var decoded = high * 256 + low;
    System.out.println(high + " " + low + " " + decoded);
}
