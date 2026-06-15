import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class UnixTimestamp {
    public static void main(String[] args) {
        // Build a FIXED UTC instant with java.time (never now()): 2026-06-15T00:00:00Z.
        OffsetDateTime fixed = OffsetDateTime.of(2026, 6, 15, 0, 0, 0, 0, ZoneOffset.UTC);
        // Convert to an Instant and read the Unix epoch SECONDS computed by the library.
        Instant instant = fixed.toInstant();
        long epochSeconds = instant.getEpochSecond();
        System.out.println(epochSeconds);
    }
}
