//JAVA 26
import java.math.BigInteger;

void main() {
  // 2^100 computed exactly with arbitrary-precision integers (no overflow).
  var result = BigInteger.TWO.pow(100);
  System.out.println(result);
}
