static class Calc {
    int value;
    Calc(int value) { this.value = value; }
    Calc add(int n) { value += n; return this; }
    Calc multiply(int n) { value *= n; return this; }
    int result() { return value; }
}

void main() {
    IO.println(new Calc(5).add(3).multiply(2).result());
}
