import java.time.LocalDate;

public class Components {
    public static void main(String[] a) {
        // Fixed date — never the current time.
        LocalDate d = LocalDate.parse("2026-06-15");
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
    }
}
