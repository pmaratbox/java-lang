//JAVA 26
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

void main() {
    var start = LocalDateTime.parse("2026-06-15T10:00");
    var later = start.plusMinutes(90);
    System.out.println(later.format(DateTimeFormatter.ofPattern("HH:mm")));
}
