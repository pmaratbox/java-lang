//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Scanners;

void main() {
    // Scanners.INTEGER matches one-or-more digits; the first .map turns the
    // matched text into an int, and the second .map transforms that value
    // by doubling it. .map is the combinator that rewrites a parser's result.
    var doubled =
        Scanners.INTEGER.map(Integer::parseInt).map(n -> n * 2);
    int result = doubled.parse("21");
    IO.println(result);
}
