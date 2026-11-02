//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import java.util.List;
import org.jparsec.Parser;
import org.jparsec.Scanners;
void main() {
    var num = Scanners.INTEGER.map(Integer::parseInt);
    var sumExpr = num.sepBy(Scanners.isChar('+'));
    var terms = sumExpr.parse("10+20+30");
    var total = terms.stream().mapToInt(Integer::intValue).sum();
    IO.println(total);
}
