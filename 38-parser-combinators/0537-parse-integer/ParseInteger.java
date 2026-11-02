//JAVA 26
//DEPS org.jparsec:jparsec:3.1
import org.jparsec.Parser;
import org.jparsec.Scanners;

void main() {
    // Scanners.INTEGER recognizes one-or-more digits; .map turns the
    // matched text into an int via Integer::parseInt.
    var number = Scanners.INTEGER.map(Integer::parseInt);
    int result = number.parse("42");
    IO.println(result);
}
