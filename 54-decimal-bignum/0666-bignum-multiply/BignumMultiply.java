import java.math.BigInteger;

public class BignumMultiply {
  public static void main(String[] args) {
    BigInteger a = BigInteger.valueOf(123456789);
    BigInteger b = BigInteger.valueOf(987654321);
    System.out.println(a.multiply(b));
  }
}
