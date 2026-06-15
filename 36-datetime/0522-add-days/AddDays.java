import java.time.LocalDate;

public class AddDays {
    public static void main(String[] args) {
        // Fixed date (never the current time), parsed by java.time.
        LocalDate start = LocalDate.parse("2026-06-15");
        // Date arithmetic via the library: add 10 days.
        LocalDate result = start.plusDays(10);
        // Default LocalDate.toString() is ISO-8601 (yyyy-MM-dd).
        System.out.println(result);
    }
}
