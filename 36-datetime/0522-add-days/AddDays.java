//JAVA 26
import java.time.LocalDate;

void main() {
    // Fixed date (never the current time), parsed by java.time.
    var start = LocalDate.parse("2026-06-15");
    // Date arithmetic via the library: add 10 days.
    var result = start.plusDays(10);
    // Default LocalDate.toString() is ISO-8601 (yyyy-MM-dd).
    IO.println(result);
}
