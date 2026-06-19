import java.math.BigDecimal;

public class DecimalCompare {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("0.1").add(new BigDecimal("0.2"));
        BigDecimal target = new BigDecimal("0.3");
        // Use compareTo()==0 (ignores scale), NOT equals() (which compares scale too).
        System.out.println(sum.compareTo(target) == 0);
    }
}
