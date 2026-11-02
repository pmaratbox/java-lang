import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

void main() {
    var d = LocalDate.of(2000, 1, 1).plusDays(3);
    IO.println(d.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
}
