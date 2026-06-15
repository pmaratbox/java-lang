import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddTime {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.parse("2026-06-15T10:00");
        LocalDateTime later = start.plusMinutes(90);
        System.out.println(later.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}
