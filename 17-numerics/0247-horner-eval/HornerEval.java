void main() {
    // coefficients of 2x^2 + 3x + 1, highest degree first
    int[] coeffs = {2, 3, 1};
    var x = 2;
    var result = 0;
    for (var c : coeffs) {
        result = result * x + c;
    }
    IO.println(result);
}
