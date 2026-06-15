//DEPS org.jparsec:jparsec:3.1
import java.util.List;
import org.jparsec.Parser;
import org.jparsec.Scanners;
public class Expression {
    public static void main(String[] args) {
        Parser<Integer> num = Scanners.INTEGER.map(Integer::parseInt);
        Parser<List<Integer>> sumExpr = num.sepBy(Scanners.isChar('+'));
        List<Integer> terms = sumExpr.parse("10+20+30");
        int total = terms.stream().mapToInt(Integer::intValue).sum();
        System.out.println(total);
    }
}
