//JAVA 26
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

void main() {
    var instant = Instant.parse("2026-06-15T12:00:00Z");
    var local = instant.atOffset(ZoneOffset.ofHours(5));
    System.out.println(local.getHour());
}
