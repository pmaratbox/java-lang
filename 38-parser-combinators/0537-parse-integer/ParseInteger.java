//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Scanners;

public class ParseInteger {
    public static void main(String[] args) {
        // Scanners.INTEGER recognizes one-or-more digits; .map turns the
        // matched text into an int via Integer::parseInt.
        Parser<Integer> number = Scanners.INTEGER.map(Integer::parseInt);
        int result = number.parse("42");
        System.out.println(result);
    }
}
