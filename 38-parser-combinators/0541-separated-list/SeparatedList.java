//DEPS org.jparsec:jparsec:3.1
import java.util.List;
import org.jparsec.Parser;
import org.jparsec.Scanners;
public class SeparatedList {
    public static void main(String[] args) {
        Parser<Integer> num = Scanners.INTEGER.map(Integer::parseInt);
        Parser<List<Integer>> list = num.sepBy(Scanners.isChar(','));
        List<Integer> nums = list.parse("1,2,3");
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
