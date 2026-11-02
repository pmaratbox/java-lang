//JAVA 26
import java.math.BigDecimal;

void main() {
    var sum = new BigDecimal("0.1").add(new BigDecimal("0.2"));
    var target = new BigDecimal("0.3");
    // Use compareTo()==0 (ignores scale), NOT equals() (which compares scale too).
    IO.println(sum.compareTo(target) == 0);
}
