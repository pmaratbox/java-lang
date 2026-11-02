//JAVA 26
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

void main() {
    // Parse a FIXED ISO date with java.time (never now()).
    var date = LocalDate.parse("2026-06-15");
    // Format it back to ISO (yyyy-MM-dd) using a DateTimeFormatter.
    var iso = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    System.out.println(date.format(iso));
}
