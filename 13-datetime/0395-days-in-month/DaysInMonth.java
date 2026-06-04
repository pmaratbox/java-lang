import java.time.YearMonth;

public class DaysInMonth {
    public static void main(String[] args) {
        int a = YearMonth.of(2000, 2).lengthOfMonth();
        int b = YearMonth.of(2001, 2).lengthOfMonth();
        System.out.println(a + " " + b);
    }
}
