import java.math.BigInteger;

public class BignumFactorial {
  public static void main(String[] args) {
    // 30! computed exactly with arbitrary-precision integers (no overflow).
    BigInteger result = BigInteger.ONE;
    for (int i = 1; i <= 30; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    System.out.println(result);
  }
}
