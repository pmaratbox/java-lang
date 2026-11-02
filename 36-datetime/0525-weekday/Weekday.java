//JAVA 26
import java.time.LocalDate;

void main() {
    // Parse a FIXED ISO date with java.time (never now()).
    var date = LocalDate.parse("2026-06-15");
    // getDayOfWeek().getValue() returns the ISO weekday number (Mon=1 .. Sun=7).
    var isoWeekday = date.getDayOfWeek().getValue();
    IO.println(isoWeekday);
}
