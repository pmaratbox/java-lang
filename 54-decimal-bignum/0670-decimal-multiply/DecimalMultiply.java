import java.math.BigDecimal;

public class DecimalMultiply {
  public static void main(String[] args) {
    BigDecimal product = new BigDecimal("1.1").multiply(new BigDecimal("1.1"));
    System.out.println(product);
  }
}
