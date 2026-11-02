//JAVA 26
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

void main() {
    // Build a FIXED UTC instant with java.time (never now()): 2026-06-15T00:00:00Z.
    var fixed = OffsetDateTime.of(2026, 6, 15, 0, 0, 0, 0, ZoneOffset.UTC);
    // Convert to an Instant and read the Unix epoch SECONDS computed by the library.
    var instant = fixed.toInstant();
    var epochSeconds = instant.getEpochSecond();
    IO.println(epochSeconds);
}
