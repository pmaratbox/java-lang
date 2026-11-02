//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Parsers;
import org.jparsec.Scanners;

void main() {
    var a = Scanners.isChar('a').retn("a");
    var b = Scanners.isChar('b').retn("b");
    var ab = Parsers.sequence(a, b, (x, y) -> x + y);
    IO.println(ab.parse("ab"));
}
