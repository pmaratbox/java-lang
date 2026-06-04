import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAddMinutes {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(10, 45).plusMinutes(90);
        System.out.println(t.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}
