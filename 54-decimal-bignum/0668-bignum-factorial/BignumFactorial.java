//JAVA 26
import java.math.BigInteger;

void main() {
  // 30! computed exactly with arbitrary-precision integers (no overflow).
  var result = BigInteger.ONE;
  for (var i = 1; i <= 30; i++) {
    result = result.multiply(BigInteger.valueOf(i));
  }
  System.out.println(result);
}
