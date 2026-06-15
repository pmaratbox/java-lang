//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Parsers;
import org.jparsec.Scanners;

public class Sequence {
    public static void main(String[] args) {
        Parser<String> a = Scanners.isChar('a').retn("a");
        Parser<String> b = Scanners.isChar('b').retn("b");
        Parser<String> ab = Parsers.sequence(a, b, (x, y) -> x + y);
        System.out.println(ab.parse("ab"));
    }
}
