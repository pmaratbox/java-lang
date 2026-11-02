void main() {
    int a = 3, b = 5;
    a ^= b;
    b ^= a;
    a ^= b;
    IO.println(a + " " + b);
}
