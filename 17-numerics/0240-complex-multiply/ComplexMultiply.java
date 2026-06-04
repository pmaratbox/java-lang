public class ComplexMultiply {
    public static void main(String[] args) {
        int ar = 1, ai = 2, br = 3, bi = 4;
        int real = ar * br - ai * bi;
        int imag = ar * bi + ai * br;
        System.out.println(real + " " + imag);
    }
}
