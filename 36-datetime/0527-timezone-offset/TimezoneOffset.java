import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TimezoneOffset {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2026-06-15T12:00:00Z");
        OffsetDateTime local = instant.atOffset(ZoneOffset.ofHours(5));
        System.out.println(local.getHour());
    }
}
