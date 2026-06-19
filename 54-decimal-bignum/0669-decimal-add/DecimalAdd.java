import java.math.BigDecimal;

public class DecimalAdd {
  public static void main(String[] args) {
    BigDecimal sum = new BigDecimal("0.1").add(new BigDecimal("0.2"));
    System.out.println(sum);
  }
}
