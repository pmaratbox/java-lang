import java.time.LocalDate;

public class Weekday {
    public static void main(String[] args) {
        // Parse a FIXED ISO date with java.time (never now()).
        LocalDate date = LocalDate.parse("2026-06-15");
        // getDayOfWeek().getValue() returns the ISO weekday number (Mon=1 .. Sun=7).
        int isoWeekday = date.getDayOfWeek().getValue();
        System.out.println(isoWeekday);
    }
}
