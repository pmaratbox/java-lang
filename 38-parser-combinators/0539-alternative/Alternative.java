//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Parsers;
import org.jparsec.Scanners;

void main() {
    var cat = Scanners.string("cat").retn("cat");
    var dog = Scanners.string("dog").retn("dog");
    // choice combinator: try `cat`, otherwise `dog`
    var animal = Parsers.or(cat, dog);
    System.out.println(animal.parse("dog"));
}
