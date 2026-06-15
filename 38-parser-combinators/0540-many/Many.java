//DEPS org.jparsec:jparsec:3.1
import java.util.List;
import org.jparsec.Parser;
import org.jparsec.Scanners;

public class Many {
    public static void main(String[] args) {
        // Scanners.isChar('a') matches a single 'a'; .many() is the repetition
        // combinator that applies it zero-or-more times, collecting each match
        // into a List. We then print the size of that list.
        Parser<List<Void>> manyA = Scanners.isChar('a').many();
        List<Void> matched = manyA.parse("aaaa");
        System.out.println(matched.size());
    }
}
