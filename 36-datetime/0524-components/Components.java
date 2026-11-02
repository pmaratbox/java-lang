//JAVA 26
import java.time.LocalDate;

void main() {
    // Fixed date — never the current time.
    var d = LocalDate.parse("2026-06-15");
    System.out.println(d.getYear());
    System.out.println(d.getMonthValue());
    System.out.println(d.getDayOfMonth());
}
