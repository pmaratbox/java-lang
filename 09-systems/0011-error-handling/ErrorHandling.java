static int divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("division by zero");
    }
    return a / b;
}

void main() {
    IO.println("10 / 2 = " + divide(10, 2));

    try {
        divide(10, 0);
    } catch (ArithmeticException e) {
        IO.println("error: " + e.getMessage());
    }
}
