import java.time.YearMonth;

void main() {
    var a = YearMonth.of(2000, 2).lengthOfMonth();
    var b = YearMonth.of(2001, 2).lengthOfMonth();
    System.out.println(a + " " + b);
}
