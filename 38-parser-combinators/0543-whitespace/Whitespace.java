//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Scanners;

void main() {
    // The integer parser maps a run of digits to an int.
    var num = Scanners.INTEGER.map(Integer::parseInt);
    // Scanners.WHITESPACES consumes one-or-more spaces; .optional() makes it
    // tolerate none. The .between(open, close) combinator runs the inner
    // parser surrounded by the two whitespace parsers, discarding them and
    // keeping only the integer. This skips leading/trailing whitespace.
    var trimmed = num.between(
        Scanners.WHITESPACES.optional(null),
        Scanners.WHITESPACES.optional(null));
    IO.println(trimmed.parse("  42  "));
}
