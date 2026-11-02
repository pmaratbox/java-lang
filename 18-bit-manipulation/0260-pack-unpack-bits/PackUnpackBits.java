void main() {
    int r = 1, g = 2, b = 3;
    var packed = (r << 16) | (g << 8) | b;
    var ur = (packed >> 16) & 0xff;
    var ug = (packed >> 8) & 0xff;
    var ub = packed & 0xff;
    System.out.println(ur + " " + ug + " " + ub);
}
