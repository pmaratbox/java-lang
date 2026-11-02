//JAVA 26
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

void main() {
    var start = LocalDate.parse("2026-06-15");
    var end = LocalDate.parse("2026-07-15");
    var days = ChronoUnit.DAYS.between(start, end);
    System.out.println(days);
}
