import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseAndFormat {
    public static void main(String[] args) {
        // Parse a FIXED ISO date with java.time (never now()).
        LocalDate date = LocalDate.parse("2026-06-15");
        // Format it back to ISO (yyyy-MM-dd) using a DateTimeFormatter.
        DateTimeFormatter iso = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(iso));
    }
}
