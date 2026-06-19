import java.math.*;

public class DecimalSubtract {
  public static void main(String[] args) {
    // BigDecimal does exact base-10 arithmetic, so 1.0 - 0.1 is exactly 0.9
    // (no binary floating-point rounding error).
    BigDecimal result = new BigDecimal("1.0").subtract(new BigDecimal("0.1"));
    System.out.println(result);
  }
}
