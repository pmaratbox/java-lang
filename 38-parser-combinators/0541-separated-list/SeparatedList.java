//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import java.util.List;
import org.jparsec.Parser;
import org.jparsec.Scanners;
void main() {
    var num = Scanners.INTEGER.map(Integer::parseInt);
    var list = num.sepBy(Scanners.isChar(','));
    var nums = list.parse("1,2,3");
    var sum = nums.stream().mapToInt(Integer::intValue).sum();
    System.out.println(sum);
}
