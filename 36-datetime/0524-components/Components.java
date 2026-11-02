//JAVA 26
import java.time.LocalDate;

void main() {
    // Fixed date — never the current time.
    var d = LocalDate.parse("2026-06-15");
    IO.println(d.getYear());
    IO.println(d.getMonthValue());
    IO.println(d.getDayOfMonth());
}
