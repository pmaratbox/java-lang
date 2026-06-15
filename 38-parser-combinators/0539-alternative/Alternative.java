//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Parsers;
import org.jparsec.Scanners;

public class Alternative {
    public static void main(String[] args) {
        Parser<String> cat = Scanners.string("cat").retn("cat");
        Parser<String> dog = Scanners.string("dog").retn("dog");
        // choice combinator: try `cat`, otherwise `dog`
        Parser<String> animal = Parsers.or(cat, dog);
        System.out.println(animal.parse("dog"));
    }
}
