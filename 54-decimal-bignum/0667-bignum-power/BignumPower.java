import java.math.BigInteger;

public class BignumPower {
  public static void main(String[] args) {
    // 2^100 computed exactly with arbitrary-precision integers (no overflow).
    BigInteger result = BigInteger.TWO.pow(100);
    System.out.println(result);
  }
}
