import java.time.LocalDate;

public class DayOfYear {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2000, 3, 1);
        System.out.println(d.getDayOfYear());
    }
}
