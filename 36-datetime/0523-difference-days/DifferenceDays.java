import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DifferenceDays {
    public static void main(String[] args) {
        LocalDate start = LocalDate.parse("2026-06-15");
        LocalDate end = LocalDate.parse("2026-07-15");
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println(days);
    }
}
